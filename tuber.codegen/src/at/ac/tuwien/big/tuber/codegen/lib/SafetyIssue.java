package at.ac.tuwien.big.tuber.codegen.lib;

public class SafetyIssue extends SupportCall {
    private Ride linkedRide;

    public SafetyIssue(String date, String issueMessage, Ride linkedRide) {
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
}