
package hib.dto;

public class BloodDonorReg 
{
    private int userId;
    private String name;
    private long contact;
    private String email;
    private String address;
    private String city;
    private String gender;
    private int age;
    private String bloodGroup;
    private String occupation;
    private String medicalHistory;
    private String donorSignature;

    public BloodDonorReg() {
    }

    public BloodDonorReg(int userId, String name, long contact, String email, String address, String city, String gender, int age, String bloodGroup, String occupation, String medicalHistory, String donorSignature) {
        this.userId = userId;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.city = city;
        this.gender = gender;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.occupation = occupation;
        this.medicalHistory = medicalHistory;
        this.donorSignature = donorSignature;
    }

    public BloodDonorReg(int userId, String name, long contNo, String age, String gender, String email, String address, String city, String bloodGroup, String occupation, String medicalHistory, String donorSignature) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDonorSignature() {
        return donorSignature;
    }

    public void setDonorSignature(String donorSignature) {
        this.donorSignature = donorSignature;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
     
    
}
