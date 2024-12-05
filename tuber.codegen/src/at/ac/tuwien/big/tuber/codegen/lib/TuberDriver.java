package at.ac.tuwien.big.tuber.codegen.lib;

public abstract class TuberDriver extends AppUser {
	public double earnings;

    public TuberDriver(String name, Location location) {
    	super(name, location);
    	this.earnings = 0;
    }
    
    public abstract double getEarnings();

    public abstract void setEarnings(double earnings);
    
    public abstract  void addEarnings(double earnings);

    public abstract void moveCloserTo(Location target);
    
    public abstract String getVehicleType();
    
    public abstract boolean isIdle();
    
    public abstract int getCapacity();
    
    public abstract int getVehicleSpeed();
    
    public abstract void raisePaymentIssue(String date, String issueMessage, Ride linkedRide);
    
    public abstract PaymentIssue getPaymentIssueByRideId(String rideId);
    
    public String toString() {
    	return "(" + this.getName() + ", Status=" + this.getStatus() + ", V=" + this.getVehicleType() + ")";
    }
}