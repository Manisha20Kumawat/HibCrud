
package hib.dto;


public class Patient {
    
       private int regNo;
       private String patientName;
       private long contactNo;
       private int age;
       private String gender;
       private String patientDetails;
       private String diseaseName;

    public Patient() {
    }

    public Patient(int regNo, String patientName, long contactNo, int age, String gender, String patientDetails, String diseaseName) {
        this.regNo = regNo;
        this.patientName = patientName;
        this.contactNo = contactNo;
        this.age = age;
        this.gender = gender;
        this.patientDetails = patientDetails;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(String patientDetails) {
        this.patientDetails = patientDetails;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
       
}
   