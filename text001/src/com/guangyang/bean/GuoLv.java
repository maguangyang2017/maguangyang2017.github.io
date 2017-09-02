package com.guangyang.bean;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class GuoLv {
    private String url;
    private int roleid;
    private int perid;

    public GuoLv(String url) {
        this.url = url;
    }

    public GuoLv(String url, int roleid) {
        this.url = url;
        this.roleid = roleid;
    }

    public GuoLv(int roleid) {
        this.roleid = roleid;
    }

    public GuoLv() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getPerid() {
        return perid;
    }

    public void setPerid(int perid) {
        this.perid = perid;
    }
}
