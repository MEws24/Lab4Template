package austriantuber.vehicle;

public class Yamaha {
    private String type;
    private int capacity;
    private int speed;

    public Yamaha() {
        this.type = "MOTORBIKE";
        this.capacity = 1;
		this.speed = 5;
        
        if (this.capacity == 1) {
        	System.out.println("--> Vehicle Info: Yamaha can accommodate 1 person at a time.");
        } else {
        	System.out.println("--> Vehicle Info: Yamaha can accommodate 1 people at a time.");
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
