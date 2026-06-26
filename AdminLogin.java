
package spr.hib.soft;


public class AdminLogin {
    
    private String aId;
    private String aPassword;
    private String post;

    public AdminLogin() {
    }

    public AdminLogin(String aId, String aPassword, String post) {
        this.aId = aId;
        this.aPassword = aPassword;
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    
   
}
