
package spr.hib.soft;


public class Doctor {
    private String doctorId;
    private String name;
    private String degree;
    private String experience;
    private String speciality;

    public Doctor() {
    }

    public Doctor(String doctorId, String name, String degree, String experience, String speciality) {
        this.doctorId = doctorId;
        this.name = name;
        this.degree = degree;
        this.experience = experience;
        this.speciality = speciality;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

   
    
}
