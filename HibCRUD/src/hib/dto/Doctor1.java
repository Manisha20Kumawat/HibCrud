
package hib.dto;

public class Doctor1 
{
    private int doctId;
    private String doctName;
    private String password;
    private long contact;
    private String experience;
    private String specialization;
    private String education;
    private String email;

    public Doctor1() {
    }

    public Doctor1(int doctId, String doctName, String password, long contact, String experience, String specialization, String education, String email) {
        this.doctId = doctId;
        this.doctName = doctName;
        this.password = password;
        this.contact = contact;
        this.experience = experience;
        this.specialization = specialization;
        this.education = education;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDoctId() {
        return doctId;
    }

    public void setDoctId(int doctId) {
        this.doctId = doctId;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
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

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
}
