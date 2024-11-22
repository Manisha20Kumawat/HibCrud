
package hib.dto;

public class AdminLogin {
    
     private int  loginId;
     private String password;

    public AdminLogin() {
    }

    public AdminLogin(int loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

     
    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}
