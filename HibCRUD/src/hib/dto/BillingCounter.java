
package hib.dto;

public class BillingCounter {
    
      private int regNo;
      private String patientName;
      private String diseaseName;
      private String paymentMode;
      private float amount;

    public BillingCounter() {
    }

    public BillingCounter(int regNo, String patientName, String diseaseName, String paymentMode, float amount) {
        this.regNo = regNo;
        this.patientName = patientName;
        this.diseaseName = diseaseName;
        this.paymentMode = paymentMode;
        this.amount = amount;
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

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName= diseaseName;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

   
      
}
