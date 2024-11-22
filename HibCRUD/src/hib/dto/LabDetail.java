
package hib.dto;

public class LabDetail 
{
    private int labNo;
    private String labName;
    private String floorNo;
    private String labDetails;

    public LabDetail() {
    }

    public LabDetail(int labNo, String labName, String floorNo, String labDetails) {
        this.labNo = labNo;
        this.labName = labName;
        this.floorNo = floorNo;
        this.labDetails = labDetails;
    }

    public String getLabDetails() {
        return labDetails;
    }

    public void setLabDetails(String labDetails) {
        this.labDetails = labDetails;
    }

    public int getLabNo() {
        return labNo;
    }

    public void setLabNo(int labNo) {
        this.labNo = labNo;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }
    
    
}
