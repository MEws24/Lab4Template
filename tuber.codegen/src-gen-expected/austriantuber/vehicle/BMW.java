package austriantuber.vehicle;

public class BMW {
    private String type;
    private int capacity;
    private int speed;

    public BMW() {
        this.type = "CAR";
        this.capacity = 3;
		this.speed = 3;
        
        if (this.capacity == 1) {
        	System.out.println("--> Vehicle Info: BMW can accommodate 3 person at a time.");
        } else {
        	System.out.println("--> Vehicle Info: BMW can accommodate 3 people at a time.");
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
