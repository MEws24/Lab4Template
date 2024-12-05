package at.ac.tuwien.big.tuber.codegen.lib;

/**
 * Stores the Location of AppUsers
 */
public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
	 * Moves the location closer to the target through the `speed` parameter.
	 * That is, if speed is 2, then the x- and y-coordinates will move 2 units towards the target.
	 * The location stops changing if the target is reached. 
	 * For Example: If the x-coordinate is 5, speed is 3, and the target is 6, then the x-coordinate will be updated to 6 and not 8.
	 * Same for y-coordinates.
     */
    public void moveCloserTo(Location target, int speed) {
    	// TODO: Implement this functio
    }

    public boolean isEqualTo(Location other) {
        // TODO: Remove return true and accordingly implement this function
        return true;
    }
    
    public void set(Location target) {
    	this.setX(target.getX());
    	this.setY(target.getY());
    }
    
    public int getDistance(Location target) {
    	// TODO: Remove return 0 and Implement this function
    	return 0;
    }

    @Override
    public String toString() {
        return "L(" + x + ", " + y + ")";
    }
}
