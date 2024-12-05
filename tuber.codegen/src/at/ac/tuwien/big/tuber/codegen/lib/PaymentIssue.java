package at.ac.tuwien.big.tuber.codegen.lib;

public class PaymentIssue extends SupportCall {
    private Ride linkedRide;

    public PaymentIssue(String date, String issueMessage, Ride linkedRide) {
        super(date, issueMessage);
        this.linkedRide = linkedRide;
    }

    public Ride getLinkedRide() {
        return linkedRide;
    }

    public void setLinkedRide(Ride linkedRide) {
        this.linkedRide = linkedRide;
    }

    @Override
    public void resolve() {
        // TODO: Implement this function
    }
    
    @Override
    public String toString() {
    	return "PaymentIssue(date="+ this.getDate() + ", message=" + this.getIssueMessage() + ", ride="+ this.linkedRide.getId() + ")";
    }
}
