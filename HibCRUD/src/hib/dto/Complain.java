
package hib.dto;

public class Complain
{
     private int regNo;
     private String Name;
     private long contactNo;
     private String date;
     private String complain;

    public Complain() {
    }

    public Complain(int regNo, String Name, long contactNo, String date, String complain) {
        this.regNo = regNo;
        this.Name = Name;
        this.contactNo = contactNo;
        this.date = date;
        this.complain = complain;
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
   
}
