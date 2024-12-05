package at.ac.tuwien.big.tuber.codegen.lib;

public abstract class SupportCall {
    private String date;
    private boolean resolutionStatus; // true if resolved, false otherwise
    private String issueMessage;
    
    public SupportCall(String date, String issueMessage) {
        this.date = date;
        this.issueMessage = issueMessage;
        this.resolutionStatus = false;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public boolean isResolved() {
        return resolutionStatus;
    }

    public void setResolutionStatus(boolean resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
    }

    public String getIssueMessage() {
        return issueMessage;
    }

    public void setIssueMessage(String issueMessage) {
        this.issueMessage = issueMessage;
    }

    // Abstract method for resolution
    public abstract void resolve();

    @Override
    public String toString() {
        return "SupportCall{" +
                "date=" + date +
                ", resolutionStatus=" + resolutionStatus +
                ", issueMessage='" + issueMessage + '\'' +
                '}';
    }
}