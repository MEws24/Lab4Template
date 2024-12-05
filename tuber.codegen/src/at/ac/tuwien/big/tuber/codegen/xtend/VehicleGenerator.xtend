package at.ac.tuwien.big.tuber.codegen.xtend

import tuber.Vehicle

class VehicleGenerator {
	public static final String VEHICLE_PACKAGE = "vehicle"
	
	def generate(String packageName, Vehicle vehicle)
	'''
	package «packageName».«VEHICLE_PACKAGE»;
	
	public class «NameUtil.toClass(vehicle.name)» {
	    private String type;
	    private int capacity;
	    private int speed;
	
	    public «NameUtil.toClass(vehicle.name)»() {
	        this.type = "«vehicle.type»";
	        this.capacity = «vehicle.capacity»;
			«IF vehicle.type.toString().equalsIgnoreCase("motorbike")»
				this.speed = 5;
			«ELSEIF vehicle.type.toString().equalsIgnoreCase("car")»
				this.speed = 3;
			«ELSE»
				this.speed = 2;
			«ENDIF»
	        
	        if (this.capacity == 1) {
	        	System.out.println("--> Vehicle Info: «vehicle.name» can accommodate «vehicle.capacity» person at a time.");
	        } else {
	        	System.out.println("--> Vehicle Info: «vehicle.name» can accommodate «vehicle.capacity» people at a time.");
	        }
	    }
	
	    public String getType() {
	        return type;
	    }
	
	    public void setType(String type) {
	        this.type = type;
	    }
	
	    public int getCapacity() {
	        return capacity;
	    }
	
	    public void setCapacity(int capacity) {
	        this.capacity = capacity;
	    }
	    
	    public int getSpeed() {
	    	return this.speed;
	    }
	}
	''' 
}