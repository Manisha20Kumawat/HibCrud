
package hib.dto;
public class NgoLogin 
{
      private String loginId;
      private String password;
      private String ngoName;
      private String ngoId;
      private String ngoEstablishedYear;
      private long contact;
      private String dateOfRegistration;
      private String address;
      private String city;
      private String  email;

    public NgoLogin() {
    }

    public NgoLogin(String loginId, String password, String ngoName, String ngoId, String ngoEstablishedYear, long contact, String dateOfRegistration, String address, String city, String email) {
        this.loginId = loginId;
        this.password = password;
        this.ngoName = ngoName;
        this.ngoId = ngoId;
        this.ngoEstablishedYear = ngoEstablishedYear;
        this.contact = contact;
        this.dateOfRegistration = dateOfRegistration;
        this.address = address;
        this.city = city;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public String getNgoId() {
        return ngoId;
    }

    public void setNgoId(String ngoId) {
        this.ngoId = ngoId;
    }

    public String getNgoEstablishedYear() {
        return ngoEstablishedYear;
    }

    public void setNgoEstablishedYear(String ngoEstablishedYear) {
        this.ngoEstablishedYear = ngoEstablishedYear;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
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

      
    
}
