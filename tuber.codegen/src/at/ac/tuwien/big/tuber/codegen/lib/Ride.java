package at.ac.tuwien.big.tuber.codegen.lib;

import java.util.Iterator;
import java.util.List;

/**
 * Represents a ride, its lifecycle, customers, and driver interactions.
 */
public interface Ride {

    /**
     * Fixed service fee rate applied to each ride.
     */
	final public static double serviceFees = 0.15; 

    /**
     * Assigns a driver to this ride.
     *
     * @param driver the driver to assign to the ride
     */
    void setDriver(TuberDriver driver);

    /**
     * Adds a customer to the ride, including details like target location, ride type, and payment type.
     * Calculates the fare based on the ride type and the distance between the customer's starting
     * location and the target location. Creates a payment object for the customer, initially marked as unpaid.
     *
     * @param customer    the customer to add
     * @param target      the destination for the customer
     * @param rideType    the type of ride (e.g., motorbike, car, luxury)
     * @param paymentType the payment method (e.g., cash, card)
     */
    void addCustomer(TuberCustomer customer, Location target, String rideType, String paymentType);

    /**
     * Checks whether the ride supports sharing among multiple customers.
     *
     * @return true if the ride allows sharing, false otherwise
     */
    boolean isSharing();

    /**
     * Checks whether the ride is currently active (not completed).
     *
     * @return true if the ride is active, false otherwise
     */
    boolean isActive();

    /**
     * Checks whether the ride has been completed.
     *
     * @return true if the ride is completed, false otherwise
     */
    boolean isCompleted();

    /**
     * Advances the ride's state by one step. If the ride is idle, it transitions to "ONGOING."
     * If ongoing, processes the next customer or ends the ride if all customers have been served.
     */
    void step();

    /**
     * Starts the ride, transitioning its status from "IDLE" to "ONGOING."
     * Updates the statuses of all associated customers and the driver.
     */
    void startRide();

    /**
     * Ends the ride, marking it as "COMPLETED." Updates the driver's status to idle
     * and confirms that all customers have been served.
     */
    void endRide();

    /**
     * Processes the next customer in the queue. Moves the driver closer to the customer's target
     * location. If the driver reaches the target, handles the customer's arrival.
     */
    void processNextCustomer();

    /**
     * Moves the driver closer to the target location of the given customer tuple.
     *
     * @param tuple a tuple containing the customer's details and target location
     */
    void takeDriverStep(Tuple tuple);

    /**
     * Handles the arrival of a customer at their destination. Resolves payment
     * or holds it if safety issues were raised. Allocates revenue and earnings,
     * updates customer status, and removes the customer from the list.
     *
     * @param tuple    the tuple containing the customer's details
     * @param iterator an iterator for safely removing the customer after processing
     */
    void handleCustomerArrival(Tuple tuple, Iterator<Tuple> iterator);

    /**
     * Prints the earnings of the driver and the service revenue from this ride.
     */
    void printEarnings();

    /**
     * Retrieves the unique identifier for this ride.
     *
     * @return the ride ID
     */
    String getId();

    /**
     * Retrieves the current status of the ride (e.g., IDLE, ONGOING, COMPLETED).
     *
     * @return the ride's status
     */
    String getStatus();

    /**
     * Retrieves the driver assigned to this ride.
     *
     * @return the driver
     */
    TuberDriver getDriver();

    /**
     * Retrieves the list of customer tuples associated with this ride.
     *
     * @return a list of customer tuples
     */
    List<Tuple> getCustomers();

    /**
     * Retrieves the revenue earned by the service from this ride.
     *
     * @return the revenue
     */
    double getRevenue();

    /**
     * Sets the revenue for this ride.
     *
     * @param revenue the revenue amount to set
     */
    void setRevenue(double revenue);

    /**
     * Returns a string representation of the ride, including its ID, status, driver, and customers.
     *
     * @return a string representation of the ride
     */
    @Override
    String toString();

    /**
     * Represents a tuple containing customer details, their target location,
     * and the payment information associated with the ride.
     */
    class Tuple {
        private final TuberCustomer customer;
        private final Location target;
        private final Payment payment;

        /**
         * Constructs a tuple for a customer, their target location, and payment details.
         *
         * @param rideId      the ID of the ride
         * @param customer    the customer
         * @param target      the target location for the customer
         * @param fare        the calculated fare for the ride
         * @param paymentType the type of payment method (e.g., cash, card)
         */
        public Tuple(String rideId, TuberCustomer customer, Location target, double fare, String paymentType) {
            this.customer = customer;
            this.target = target;
            this.payment = customer.createPayment(rideId, fare, paymentType);
        }

        /**
         * Gets the customer associated with this tuple.
         *
         * @return the customer
         */
        public TuberCustomer getCustomer() {
            return customer;
        }

        /**
         * Gets the target location associated with this tuple.
         *
         * @return the target location
         */
        public Location getTarget() {
            return target;
        }

        /**
         * Gets the payment object associated with this tuple.
         *
         * @return the payment object
         */
        public Payment getPayment() {
            return payment;
        }
    }

    /**
     * Calculates the rate multiplier based on the vehicle type.
     *
     * @param vehicleType the type of vehicle (e.g., motorbike, car, luxury)
     * @return the rate multiplier for the vehicle type
     * @throws IllegalArgumentException if the vehicle type is invalid
     */
    static float getRateMultiplier(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "motorbike":
                return 2.0f;
            case "car":
                return 4.5f;
            case "luxury":
                return 10.3f;
            default:
                throw new IllegalArgumentException("Invalid ride type: " + vehicleType);
        }
    }
}