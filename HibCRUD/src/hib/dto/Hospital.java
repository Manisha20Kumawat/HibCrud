
package hib.dto;

public class Hospital 
{
    private String hospitalName;
    private String hospitalId;
    private String hospRegNo;
    private String password;
    private String city;
    private int rank;
    private long contact;
    private String email;

    public Hospital() {
    }

    public Hospital(String hospitalName, String hospitalId, String hospRegNo, String password, String city, int rank, long contact, String email) {
        this.hospitalName = hospitalName;
        this.hospitalId = hospitalId;
        this.hospRegNo = hospRegNo;
        this.password = password;
        this.city = city;
        this.rank = rank;
        this.contact = contact;
        this.email = email;
    }

    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospRegNo() {
        return hospRegNo;
    }

    public void setHospRegNo(String hospRegNo) {
        this.hospRegNo = hospRegNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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
    
}

