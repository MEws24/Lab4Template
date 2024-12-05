package at.ac.tuwien.big.tuber.codegen.lib;

/*
 * Stores all relevant data and attributes related to payments.
 * The pay function simply sets the payment status to true.
 */
public class Payment {
    private double amount;
    private String type;
    public boolean status;


    public Payment(double amount, String type) {
        this.amount = amount;
        this.type = type;
        this.status = false;
    }
    
    public boolean pay() {
    	// TODO: Implement this function. True indicates that the payment is successful. 
    	// Assuming the payment is always successful, add the remaining logic
    	return true;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Payment{" +
        		"amount=" + amount +
                ", type=" + type +
                '}';
    }
}