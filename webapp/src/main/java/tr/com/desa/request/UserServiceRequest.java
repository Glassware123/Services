package tr.com.desa.request;
public class UserServiceRequest {
    private String username;
    private String password;
    private String email;

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public String geteMail() {
        return email;
    }

    public void seteMail(String eMail) {
        this.email = eMail;
    }
}
