
package hib.dto;

public class Feedback 
{
      private int regNo;
      private String Name;
      private String date;
      private String feedback;

    public Feedback() {
    }

    public Feedback(int regNo, String Name, String date, String feedback) {
        this.regNo = regNo;
        this.Name = Name;
        this.date = date;
        this.feedback = feedback;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
