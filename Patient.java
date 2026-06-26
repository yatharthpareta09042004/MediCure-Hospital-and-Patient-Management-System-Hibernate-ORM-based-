package spr.hib.soft;
public class Patient {
    
       private String patientId;
       private String password;
       private String name;
       private String gender;
       private int age;      
       private String contactNo;
       private String address;
       private int pincode;
       private String city;
       private long aadharNo;
       private String disease;

    public Patient() {
    }

    public Patient(String patientId, String password, String name, String gender,int age, String contactNo, String address, int pincode, String city, long aadharNo, String disease) {
        this.patientId = patientId;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.age=age;
        this.contactNo = contactNo;
        this.address = address;
        this.pincode = pincode;
        this.city = city;
        this.aadharNo = aadharNo;
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(long aadharNo) {
        this.aadharNo = aadharNo;
    }
       
       
}
