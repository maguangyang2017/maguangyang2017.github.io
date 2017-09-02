package com.guangyang.bean;

/**
 * Created by 马光阳 on 2017/7/2.
 */
public class User {
    private int id;
    private String uname;
    private String upassword;
    private int status;

    public User() {
    }

    public User(int id, String uname, String upassword) {
        this.id = id;
        this.uname = uname;
        this.upassword = upassword;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}
