package austriantuber.agents;

import at.ac.tuwien.big.tuber.codegen.lib.Message;
import at.ac.tuwien.big.tuber.codegen.lib.Ride;
import at.ac.tuwien.big.tuber.codegen.lib.RideImpl;
import at.ac.tuwien.big.tuber.codegen.lib.RideMessage;
import at.ac.tuwien.big.tuber.codegen.lib.SupportCallMessage;
import at.ac.tuwien.big.tuber.codegen.lib.SafetyIssue;
import at.ac.tuwien.big.tuber.codegen.lib.TuberCustomer;
import at.ac.tuwien.big.tuber.codegen.lib.TuberDriver;
import at.ac.tuwien.big.tuber.codegen.lib.Payment;
import at.ac.tuwien.big.tuber.codegen.lib.PaymentIssue;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Queue;
import java.util.Map;

import austriantuber.user.C7; 
import austriantuber.user.C9; 
import austriantuber.user.C6; 
import austriantuber.user.D5; 
import austriantuber.user.D6; 

public class LinzCabsManager {
	
	public Map<String, Ride> rides;
	public Map<String, TuberDriver> drivers;
	public Map<String, TuberCustomer> customers;
	public Queue<Message> messages;
	public String city;
	public double revenue;

	public LinzCabsManager(Queue<Message> messages) {
		this.messages = messages;
		this.city = "LINZ";
		this.revenue = 0.0;
		this.customers = new HashMap<>();
		this.drivers = new HashMap<>();
		this.rides = new HashMap<>();
		
		System.out.println("== Messages ==\n");
		for (Message m: messages) System.out.println("[+] Added: " + m);
		System.out.println("");
	}

	public void setUp(){
		System.out.println("== Users & Vehicles ==\n");
		C7 c7 = new C7();
		this.customers.put("C7", c7);
		System.out.println("[+] Added Customer: " + c7.getName());
		C9 c9 = new C9();
		this.customers.put("C9", c9);
		System.out.println("[+] Added Customer: " + c9.getName());
		C6 c6 = new C6();
		this.customers.put("C6", c6);
		System.out.println("[+] Added Customer: " + c6.getName());
		D5 d5 = new D5();
		this.drivers.put("D5", d5);
		System.out.println("[+] Added Driver: " + d5.getName());
		D6 d6 = new D6();
		this.drivers.put("D6", d6);
		System.out.println("[+] Added Driver: " + d6.getName());
	}
	
	public void addCustomer(TuberCustomer customer) {
		this.customers.put(customer.getName(), customer);
	}
	
	public void addDriver(TuberDriver driver) {
		this.drivers.put(driver.getName(), driver);
	}
	
	public boolean processRequest(Message message) {
		System.out.println("[*] Processing Message: " + message);
		if (message instanceof RideMessage) {
			RideMessage rideMessage = (RideMessage) message;
			return this.handleRideRequest(rideMessage);
		} else if (message instanceof SupportCallMessage) {
			SupportCallMessage supportMessage = (SupportCallMessage) message;
			return this.handleSupportCallRequest(supportMessage);
		}
		return true;
	}
	
	public boolean handleRideRequest(RideMessage rideMessage) {
		if (this.customers.containsKey(rideMessage.user)) {
			// If user is found, set the status of the customer to REQUESTED
			TuberCustomer customer = this.customers.get(rideMessage.user);
			customer.status = "REQUESTED";
			System.out.println("--> Updated Customer Status: " + customer);
			
			// Check if there is a driver that drives a vehicle of vehicle type given in the request
			if (!this.drivers.values().stream().anyMatch(driver -> driver.getVehicleType().equalsIgnoreCase(rideMessage.type))) {
				System.out.println("[✗] No driver with a " + rideMessage.type + " vehicle available!");
				return true;
			}
			
			// If there is/are driver(s) that drive a vehicle of type rideType then search for a matching driver
			TuberDriver driver = this.matchDriver(customer, rideMessage.type, rideMessage.sharing);
			if(driver == null){
				System.out.println("[!] Unable to find an available Driver. Will try again later...");
				return false;
			}
			
			/*
				If found driver has an ongoing ride (i.e., not IDLE), then add the customer to the ride's list of customers.
				No need to check for the sharing status because the match function checks it.
				Match function first returns idle drivers and then busy drivers.
			*/
			Ride ride = null;
			if (!driver.getStatus().equalsIgnoreCase("idle")) {
				if (this.rides.containsKey(driver.getName())) {
					ride = this.rides.get(driver.getName());
					ride.addCustomer(customer, rideMessage.target, rideMessage.type, rideMessage.paymentType);
					System.out.println("--> " + customer.getName() + " added to the existing ride " + ride + " of driver: " + driver.getName());
				} else {
					System.out.println("[!] Driver is not IDLE but no associated ride found");
					return false;
				}
			}
			/*
				If found driver is IDLE, create a new ride and set the driver of the ride to the found driver.
				Also add the customer to the list of ride customers.
			*/
			else {
				driver.updateLocation(customer.getLocation()); // Set the location of the driver to the location of the customer
				System.out.println("--> Moved Driver " + driver.getName() + " from " + driver.getLocation() + " to " + customer.getLocation());
				ride = new RideImpl(rideMessage.rideId, rideMessage.date, rideMessage.sharing);
				this.rides.put(driver.getName(), ride);
				ride.setDriver(driver); // Set the driver of the ride
				ride.addCustomer(customer, rideMessage.target, rideMessage.type, rideMessage.paymentType); // Add the customer to the list of customers
				System.out.println("[+] Created Ride: " + ride);
				ride.step(); 
			}
		} else {
			System.out.println("[✗] User " + rideMessage.user + " not found in the Cabs Manager Customer DB!");
		}
		
		return true;
	}
	
	public boolean handleSupportCallRequest(SupportCallMessage supportMessage) {
		if (supportMessage.rideId == null) {
			System.out.println("[!] SupportMessage cannot have null rideId. Skipping Request");
			return true;
		}
		
		// Get the ride associated with the customer of the request
		TuberCustomer customer = this.customers.get(supportMessage.user);
		Ride associatedRide = this.getRideById(supportMessage.rideId);
		if (associatedRide == null) {
			System.out.println("[✗] No ride found with id: " + supportMessage.rideId);
			return false;
		}
		
		// If the issue text is "issue resolved", then it is a safety issue resolution request
		if (supportMessage.getIssueText().equalsIgnoreCase("issue resolved")) {
			// Resolving Safety Issue
			SafetyIssue safetyIssue = customer.getSafetyIssueByRideId(associatedRide.getId());
			safetyIssue.resolve();
			System.out.println("[✓] Safety Issue Resolved for ride: " + associatedRide);
			
			// If the associated customer's ride is finished, then settle the payments. Otherwise, all good.
			// Add the resolved payments to the agent's revenue
			if (!rideContainsCustomer(associatedRide, customer)) {
				System.out.println("Resolving Payment Issue for driver: " + associatedRide.getDriver());
				Payment payment = customer.getPaymentByRideId(supportMessage.rideId);
				payment.pay();
				
				associatedRide.setRevenue(associatedRide.getRevenue() + (payment.getAmount()*Ride.serviceFees));
				associatedRide.getDriver().earnings += payment.getAmount()*(1 - Ride.serviceFees);
				PaymentIssue paymentIssue = associatedRide.getDriver().getPaymentIssueByRideId(associatedRide.getId());
				paymentIssue.resolve();
				
				revenue += payment.getAmount()*Ride.serviceFees;
			}
		}
		// If the issue text is not "Issue resolved" then it is an issue creation request.
		else customer.raiseSafetyIssue(supportMessage.date, supportMessage.getIssueText(), associatedRide);
		
		return true;
	}
	
	public boolean rideContainsCustomer(Ride r, TuberCustomer c) {
		return r.getCustomers().stream()
				.anyMatch(tuple -> tuple.getCustomer().equals(c));
	}
	
	public Ride getRideById(String id) {
		if (id == null) return null;
		for (Ride r : this.rides.values()) if (r.getId().equals(id)) return r;
		return null;
	}

	public TuberDriver matchDriver(TuberCustomer customer, String rideType, boolean sharing) {
	    TuberDriver closestDriver = null;
	    double shortestDistance = Double.MAX_VALUE; // Initialize with maximum possible value
	    
	    for (TuberDriver driver: this.drivers.values()) {
	    	if(this.isDriverAvailable(driver, sharing) && driver.getVehicleType().equalsIgnoreCase(rideType)) {
	    		double distance = customer.location.getDistance(driver.location);
	            if (distance < shortestDistance) {
	                shortestDistance = distance;
	                closestDriver = driver;
	            }
	    	}
	    }

	    return closestDriver; 
	    /*
	    // Returns the closest idle driver.
	    Or the one that supports sharing and vehicle capacity is still bigger than number of customers
	    If none of these conditions satisfy then null
	    */
	}
	
	public boolean isDriverAvailable(TuberDriver driver, boolean sharing) {
		if(driver.isIdle())return true;
		boolean driverAvailable = this.rides.values().stream()
        	.filter(ride -> sharing && ride.isSharing() && ride.isActive())
        	.filter(ride -> ride.getDriver().getCapacity() > ride.getCustomers().size())
        	.anyMatch(ride -> ride.getDriver().equals(driver));
		
		return driverAvailable;
	}
	
	public Ride getActiveRideOfCustomer(TuberCustomer customer) {
		Ride ride = null;
		for (Ride r : this.rides.values()) {
			if (!r.getStatus().equalsIgnoreCase("ongoing")) continue;
			
			Iterator<Ride.Tuple> iterator = r.getCustomers().iterator();
			
			while (iterator.hasNext()) {
			    Ride.Tuple tuple = iterator.next();
			    if (tuple.getCustomer().equals(customer)) {
			    	return r;
			    }
			}
		}
		return ride;
	}

	public boolean hasStep() {
		if (!messages.isEmpty()) return true;
		return !this.rides.values().stream()
			.allMatch(ride -> ride.getStatus().equalsIgnoreCase("completed"));
	}
	
	public void step() {
		if (this.rides != null && this.rides.size() > 0) {
			System.out.println("Ongoing Rides: ");
			for (Ride r : this.rides.values()) System.out.println("- Ride: " + r.toString());
		} else {
			System.out.println("No ongoing Rides.");
		}
		System.out.println("");
		
		Iterator<String> ridesiterator = this.rides.keySet().iterator();
		while (ridesiterator.hasNext()) {
			String driverName = ridesiterator.next();
			Ride r = this.rides.get(driverName);
			if (r.isActive()) r.step();
			if (r.isCompleted()) {
				this.revenue += r.getRevenue();
				ridesiterator.remove();
			}
		}
		
		Iterator<Message> messagesIterator = messages.iterator();
		while (messagesIterator.hasNext()) {
			Message nextMessage = messagesIterator.next();
			if (this.processRequest(nextMessage)) {
		    	messagesIterator.remove();
		    }
		}
	}
	
	public String toString() {
		return "LinzCabsManager("
			+ "Customers=" + String.valueOf(this.customers.size())
			+ ", Drivers=" + String.valueOf(this.drivers.size())
			+ ", Rides="+ String.valueOf(this.rides.size()) + ")";
	}
	
	public void printLinzCabsManagerInfo() {
		System.out.println("Number of Users: " + 9);
		System.out.println("Number of Drivers: " + this.drivers.size());
		System.out.println("Number of Customers: " + this.customers.size());
		System.out.println("Number of Rides: " + this.rides.size());

		long completedRides = this.rides.values().stream()
				.filter(r -> r.getStatus().equalsIgnoreCase("completed"))
				.count();
		long activeRides = this.rides.values().stream()
				.filter(r -> r.getStatus().equalsIgnoreCase("ongoing"))
				.count();
		System.out.println("Completed Rides: " + completedRides);
		System.out.println("Active Rides: " + activeRides);
		System.out.println("Total Revenue: " + String.format("%.2f", revenue) + '€');
	}
}
