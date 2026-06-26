
package spr.hib.soft;

public class PatientBed {
 
    private String patientId;
    private int bedNo;
    private String disease;
    private String attender;
    private String alotDate;

    public PatientBed() {
    }

    public PatientBed(String patientId, int bedNo, String disease, String attender, String alotDate) {
        this.patientId = patientId;
        this.bedNo = bedNo;
        this.disease = disease;
        this.attender = attender;
        this.alotDate = alotDate;
    }

    public String getAlotDate() {
        return alotDate;
    }

    public void setAlotDate(String alotDate) {
        this.alotDate = alotDate;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public int getBedNo() {
        return bedNo;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAttender() {
        return attender;
    }

    public void setAttender(String attender) {
        this.attender = attender;
    }
    
    
    
    
    
}
