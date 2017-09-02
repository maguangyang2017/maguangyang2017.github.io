package com.guangyang.bean;

import java.sql.Timestamp;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class AdminUser {
    private int id;
    private String username;
    private String password;
    private Timestamp ctime;
    private String loginip;
    private int status;

    public AdminUser() {
    }

    public AdminUser(int id, String username, String password, Timestamp ctime, String loginip, int status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ctime = ctime;
        this.loginip = loginip;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
