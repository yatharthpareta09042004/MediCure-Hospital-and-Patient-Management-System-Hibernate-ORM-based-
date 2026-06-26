
package spr.hib.soft;



public class Prescription {
    
    private String patientId;
    private String prescription;

    public Prescription() {
    }

    public Prescription(String patientId, String prescription) {
        this.patientId = patientId;
        this.prescription = prescription;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    
    
    
    
}
