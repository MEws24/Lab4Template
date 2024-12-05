package austriantuber.user;

import austriantuber.vehicle.Yamaha;

import at.ac.tuwien.big.tuber.codegen.lib.TuberDriver;
import at.ac.tuwien.big.tuber.codegen.lib.Location;
import at.ac.tuwien.big.tuber.codegen.lib.PaymentIssue;
import at.ac.tuwien.big.tuber.codegen.lib.Ride;
import at.ac.tuwien.big.tuber.codegen.lib.SupportCall;

public class D1 extends TuberDriver {
    private Yamaha yamaha;

    // Constructor
    public D1() {
    	super("D1", new Location(2, 4)); 
    	System.out.println("[*] Setting Vehicle for driver: D1");
        this.yamaha = new Yamaha();
    }

	public Yamaha getVehicle() {
		return yamaha;
	}

	public String getVehicleType() {
		return yamaha.getType();
	}

	public void setVehicle(Yamaha yamaha) {
        this.yamaha = yamaha;
    }

    public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

	public void addEarnings(double earnings) {
		this.earnings += earnings;
	}

	public void moveCloserTo(Location target) {
		location.moveCloserTo(target, this.getVehicleSpeed());
	}
	
	public boolean isIdle() {
		return this.getStatus().equalsIgnoreCase("idle");
	}
	
	public int getCapacity() {
		return this.getVehicle().getCapacity();
	}
	
	public int getVehicleSpeed() {
		return this.getVehicle().getSpeed();
	}

	public void raisePaymentIssue(String date, String issueMessage, Ride linkedRide) {
		PaymentIssue paymentIssue = new PaymentIssue(date, issueMessage, linkedRide);
		System.out.println("[+] Created: " + paymentIssue);
		this.supportCalls.put(linkedRide.getId(), paymentIssue);
	}
	
	public PaymentIssue getPaymentIssueByRideId(String rideId) {
		PaymentIssue paymentIssue = null;
		for (SupportCall call : this.supportCalls.values()) {
			if (call instanceof PaymentIssue) {
				paymentIssue = (PaymentIssue) call;
				if (paymentIssue.getLinkedRide() != null && paymentIssue.getLinkedRide().getId() == rideId) {
					return paymentIssue;
				}
			}
		}
		return paymentIssue; // No matching SafetyIssue found
	}
}

