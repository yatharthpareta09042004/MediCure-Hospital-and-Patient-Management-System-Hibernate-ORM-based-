
package spr.hib.soft;


public class VisitorPass {
     private String patientId;
     private String passNo;
     private String issueDate; 
     private String validity;

    public VisitorPass() {
    }

    public VisitorPass(String patientId, String passNo, String issueDate, String validity) {
        this.patientId = patientId;
        this.passNo = passNo;
        this.issueDate = issueDate;
        this.validity = validity;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPassNo() {
        return passNo;
    }

    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

             
    
}
