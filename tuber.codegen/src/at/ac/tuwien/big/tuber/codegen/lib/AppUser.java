package at.ac.tuwien.big.tuber.codegen.lib;

import java.util.HashMap;
import java.util.Map;

/*
 * This is the User class that stores the name, status and location of a User
 * This also stores the support calls made by the user according to the rides
*/
public abstract class AppUser {
	
	private String name;
	public String status;
	public Location location;
	public Map<String, SupportCall> supportCalls;
    
	
	/*	
     * The user is instantiated with Idle state and empty support calls map
     * */
	public AppUser(String name, Location location) {
		
		this.name = name;
		this.location = location;
		this.status = "IDLE";
		this.supportCalls = new HashMap<String, SupportCall>();
	}
	
	public Map<String, SupportCall> getSupportCalls(){
		return supportCalls;
	}
	
	public String getName() {
		return name;
	}
	
    public void updateLocation(Location target) {
    	this.location.set(target);
    }
    
    public Location getLocation() {
    	return this.location;
    }
    
    public String getStatus() {
    	return this.status;
    }
}
