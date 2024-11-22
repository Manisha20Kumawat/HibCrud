
package hib.dto;

public class Patient1 
{
    private int regNo;
    private String patientName;
    private long contactNo;
    private String dob;
    private String gender;
    private String status;
    private String address;
    private String city;
    private String bloodGroup;
    private String diseaseName;

    public Patient1() {
    }

    public Patient1(int regNo, String patientName, long contactNo, String dob, String gender, String status, String address, String city, String bloodGroup, String diseaseName) {
        this.regNo = regNo;
        this.patientName = patientName;
        this.contactNo = contactNo;
        this.dob = dob;
        this.gender = gender;
        this.status = status;
        this.address = address;
        this.city = city;
        this.bloodGroup = bloodGroup;
        this.diseaseName = diseaseName;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
}
