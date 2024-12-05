package at.ac.tuwien.big.tuber.codegen.lib;

public class RideMessage extends Message {
	public Location target;
    public boolean sharing;
    public String type;
    public String paymentType;

    public RideMessage(String user, String date, String rideId, String rideType, String paymentType, boolean sharing, Location target) {
        super(rideId, user, date);
        this.target = target;
        this.sharing = sharing;
        this.type = rideType;
        this.paymentType = paymentType;
    }
    
    public boolean isSharing() {
    	return this.sharing;
    }
    
    @Override
    public String toString() {
        return "RideMessage("
    		+ "user=" + this.getUser() + 
    		", date=" + this.date + 
    		", dest=" + this.target + 
    		(this.sharing ? ", Shared" : "") +
        ")";
    }
}