
package spr.hib.soft;




public class PatientReport {
    
    private String patientId;
    private String disease;
    private String patientReport;
    private String  doctor;

    public PatientReport() {
    }

    public PatientReport(String patientId, String disease, String patientReport, String doctor) {
        this.patientId = patientId;
        this.disease = disease;
        this.patientReport = patientReport;
        this.doctor = doctor;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getPatientReport() {
        return patientReport;
    }

    public void setPatientReport(String patientReport) {
        this.patientReport = patientReport;
    }

    
    
}
