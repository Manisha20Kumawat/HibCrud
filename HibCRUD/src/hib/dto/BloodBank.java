
package hib.dto;

public class BloodBank 
{
        private int regNo;
        private String bloodGroup;
        private float quantity;

    public BloodBank() {
    }

    public BloodBank(int regNo, String bloodGroup, float quantity) {
        this.regNo = regNo;
        this.bloodGroup = bloodGroup;
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

        
   
        
        
}
