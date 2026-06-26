/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.hib.soft;

public class Bill {
    
    private String patientId;
    private String bill;
    private String billDescription;

    public Bill() {
    }

    public Bill(String patientId, String bill, String billDescription) {
        this.patientId = patientId;
        this.bill = bill;
        this.billDescription = billDescription;
    }

    public String getBillDescription() {
        return billDescription;
    }

    public void setBillDescription(String billDescription) {
        this.billDescription = billDescription;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }
    
}
