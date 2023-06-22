/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineRS.pojo;

/**
 *
 * @author Acer
 */
public class RegisterUserpojo {

    public RegisterUserpojo(String loginid, String username, String password, String mobailno) {
        this.loginid = loginid;
        this.username = username;
        this.password = password;
        this.mobailno = mobailno;
    }
    public RegisterUserpojo(){
        
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobailno() {
        return mobailno;
    }

    public void setMobailno(String mobailno) {
        this.mobailno = mobailno;
    }
    private String loginid;
    private String username;
    private String password;
    private String mobailno;
}
