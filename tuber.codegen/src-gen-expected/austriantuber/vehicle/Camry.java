package austriantuber.vehicle;

public class Camry {
    private String type;
    private int capacity;
    private int speed;

    public Camry() {
        this.type = "CAR";
        this.capacity = 1;
		this.speed = 3;
        
        if (this.capacity == 1) {
        	System.out.println("--> Vehicle Info: Camry can accommodate 1 person at a time.");
        } else {
        	System.out.println("--> Vehicle Info: Camry can accommodate 1 people at a time.");
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
