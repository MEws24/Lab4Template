package austriantuber.user;

import at.ac.tuwien.big.tuber.codegen.lib.Location;
import at.ac.tuwien.big.tuber.codegen.lib.Payment;
import at.ac.tuwien.big.tuber.codegen.lib.Ride;
import at.ac.tuwien.big.tuber.codegen.lib.SafetyIssue;
import at.ac.tuwien.big.tuber.codegen.lib.SupportCall;
import at.ac.tuwien.big.tuber.codegen.lib.TuberCustomer;

public class C9  extends TuberCustomer {
	
	public C9() {
		super("C9", new Location(2, 4));
	}
	
	public float getSpendings() {
		float spendings = 0;
		for (Payment payment : this.payments.values()) {
			if (payment.status) {
				spendings += payment.getAmount();
			}
		}
		return spendings;
	}
	
	public Payment createPayment(String rideId, double amount, String paymentType) {
		Payment payment = new Payment(amount, paymentType);
		this.payments.put(rideId, payment);
		return payment;
	}
	
	public void pay(String rideId) {
		this.payments.get(rideId).pay();
	}
	
	public Payment getPaymentByRideId(String rideId){
		Payment payment = this.payments.get(rideId);
		return payment;
	}
	
	public boolean hasRaisedSafetyIssue(String rideId) {
		for (SupportCall call : this.supportCalls.values()) {
			if (call instanceof SafetyIssue) {
				SafetyIssue safetyIssue = (SafetyIssue) call;
				if (safetyIssue.getLinkedRide() != null && safetyIssue.getLinkedRide().getId() == rideId) {
					return true;
				}
			}
		}
		return false; // No matching SafetyIssue found
	}
	
	public SafetyIssue getSafetyIssueByRideId(String rideId) {
		SafetyIssue safetyIssue = null;
		for (SupportCall call : this.supportCalls.values()) {
			if (call instanceof SafetyIssue) {
				safetyIssue = (SafetyIssue) call;
				if (safetyIssue.getLinkedRide() != null && safetyIssue.getLinkedRide().getId() == rideId) {
					return safetyIssue;
				}
			}
		}
		return safetyIssue; // No matching SafetyIssue found
	}
	
	public void raiseSafetyIssue(String date, String issueMessage, Ride linkedRide) {
		SafetyIssue safetyIssue = new SafetyIssue(date, issueMessage, linkedRide);
		this.supportCalls.put(linkedRide.getId(), safetyIssue);
		System.out.println("[+] Added: "+ safetyIssue);
	}
}
