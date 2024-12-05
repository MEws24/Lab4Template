package at.ac.tuwien.big.tuber.codegen.lib;

public abstract class Message {
	public String rideId;
    public String user;
    public String date;

    public Message(String rideId, String user, String date) {
    	this.rideId = rideId;
        this.user = user;
        this.date = date;
    }

    public String getUser() {
        return user;
    }
    public String getDate() {
    	return date;
    }
}
