package struts2jsonjquery.test.entity;

public class UserInfo {
    
    private int userId;
    
    private String userName;
    
    private String password;

    public void setUserId(int i) {
        userId = i;
        
    }

    public void setUserName(String string) {
        userName = string;
        
    }

    public void setPassword(String string) {
        password = string;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

}