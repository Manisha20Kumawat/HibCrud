
package hib.dto;

public class Doctor {
    
     private String doctorName;
     private String doctId;
     private String password;
     private long contact;
     private String specialization;
     private String experience;
     private String education;

    public Doctor() {
    }

    public Doctor(String doctorName, String doctId, String password, long contact, String specialization, String experience, String education) {
        this.doctorName = doctorName;
        this.doctId = doctId;
        this.password = password;
        this.contact = contact;
        this.specialization = specialization;
        this.experience = experience;
        this.education = education;
    }

     
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctId() {
        return doctId;
    }

    public void setDoctId(String doctId) {
        this.doctId = doctId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
     
}

    