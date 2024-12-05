package at.ac.tuwien.big.tuber.codegen.lib;

public class SupportCallMessage extends Message {
    private String issueText;

    public SupportCallMessage(String rideId, String userName, String date, String issueText) {
        super(rideId, userName, date);
        this.issueText = issueText;
    }

    public String getIssueText() {
        return issueText;
    }

    @Override
    public String toString() {
        return "SupportCallMessage("
        		+ "id=" + this.rideId +
        		", user=" + this.getUser() + 
        		", date=" + this.date + 
        		", issue=" + this.issueText + 
        		", type=Safety" +
            ")";
    }
}