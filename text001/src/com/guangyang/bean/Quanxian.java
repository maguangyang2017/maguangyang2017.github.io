package com.guangyang.bean;

import java.sql.Timestamp;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public class Quanxian {
    private int id;
    private String qname;
    private String urll;
    private Timestamp ctime;

    public Quanxian() {
    }

    public Quanxian(int id, String qname, String urll, Timestamp ctime) {
        this.id = id;
        this.qname = qname;
        this.urll = urll;
        this.ctime = ctime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public String getUrll() {
        return urll;
    }

    public void setUrll(String urll) {
        this.urll = urll;
    }

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }
}
