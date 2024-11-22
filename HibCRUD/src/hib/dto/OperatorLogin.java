
package hib.dto;

public class OperatorLogin 
{
      private String loginId;
      private String password;

    public OperatorLogin() {
    }

    public OperatorLogin(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
      
      
}
