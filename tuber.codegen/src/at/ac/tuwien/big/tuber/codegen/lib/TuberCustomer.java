package at.ac.tuwien.big.tuber.codegen.lib;

import java.util.HashMap;
import java.util.Map;

public abstract class TuberCustomer extends AppUser {
	public Map<String, Payment> payments;
	
    public TuberCustomer(String name, Location location) {
    	super(name, location);
    	payments = new HashMap<String, Payment>();
    }
    
    public abstract float getSpendings();
    
    public abstract Payment createPayment(String rideId, double amount, String paymentType);
    
    public abstract Payment getPaymentByRideId(String rideId);
    
    public abstract void pay(String rideId);
    
    public abstract SafetyIssue getSafetyIssueByRideId(String rideId);
    
    public abstract boolean hasRaisedSafetyIssue(String rideId);
    
    public abstract void raiseSafetyIssue(String date, String issueMessage, Ride linkedRide);
    
    public String toString() {
    	return "(" + this.getName() + ", status=" + this.getStatus() + ")";
    }
}