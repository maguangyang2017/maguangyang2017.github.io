package com.guangyang.bean;

import java.sql.Timestamp;

/**
 * Created by 马光阳 on 2017/7/16.
 */
public class Liuyan {
    private int id;
    private int type;
    private int xid;
    private String name;
    private String dian;
    private String shou;
    private String you;
    private String content;
    private Timestamp ctime;

    public Liuyan() {
    }

    public Liuyan(int id, int type, int xid, String name, String dian, String shou, String you, String content, Timestamp ctime) {
        this.id = id;
        this.type = type;
        this.xid = xid;
        this.name = name;
        this.dian = dian;
        this.shou = shou;
        this.you = you;
        this.content = content;
        this.ctime = ctime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getXid() {
        return xid;
    }

    public void setXid(int xid) {
        this.xid = xid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDian() {
        return dian;
    }

    public void setDian(String dian) {
        this.dian = dian;
    }

    public String getShou() {
        return shou;
    }

    public void setShou(String shou) {
        this.shou = shou;
    }

    public String getYou() {
        return you;
    }

    public void setYou(String you) {
        this.you = you;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Liuyan{" +
                "id=" + id +
                ", type=" + type +
                ", xid=" + xid +
                ", name='" + name + '\'' +
                ", dian='" + dian + '\'' +
                ", shou='" + shou + '\'' +
                ", you='" + you + '\'' +
                ", content='" + content + '\'' +
                ", ctime=" + ctime +
                '}';
    }
}
