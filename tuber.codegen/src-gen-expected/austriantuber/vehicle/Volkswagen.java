package austriantuber.vehicle;

public class Volkswagen {
    private String type;
    private int capacity;
    private int speed;

    public Volkswagen() {
        this.type = "CAR";
        this.capacity = 4;
		this.speed = 3;
        
        if (this.capacity == 1) {
        	System.out.println("--> Vehicle Info: Volkswagen can accommodate 4 person at a time.");
        } else {
        	System.out.println("--> Vehicle Info: Volkswagen can accommodate 4 people at a time.");
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
