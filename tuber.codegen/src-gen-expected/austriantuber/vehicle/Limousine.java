package austriantuber.vehicle;

public class Limousine {
    private String type;
    private int capacity;
    private int speed;

    public Limousine() {
        this.type = "LUXURY";
        this.capacity = 6;
		this.speed = 2;
        
        if (this.capacity == 1) {
        	System.out.println("--> Vehicle Info: Limousine can accommodate 6 person at a time.");
        } else {
        	System.out.println("--> Vehicle Info: Limousine can accommodate 6 people at a time.");
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
