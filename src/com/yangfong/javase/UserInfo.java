package com.yangfong.javase;

/**
 * Created by Bruce.Jiao on 17-2-28.
 */
public class UserInfo {

    private String loginName;
    private String password;

    public UserInfo(){}

    public UserInfo(String loginName, String password){
        this.loginName = loginName;
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
