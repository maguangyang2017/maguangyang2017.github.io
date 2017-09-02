package com.guangyang.bean;

import java.sql.Timestamp;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class Rizhi {
    private int id;
    private  String user;
    private String caozuo;
    private String ctime;
    private  String url;
    private String qtype;
    private String canshu;
    private String uip;
    private String quanxian;
    private String biaoshi;

    public Rizhi() {
    }

    public Rizhi(int id, String user, String caozuo, String ctime, String url, String qtype, String canshu, String uip, String quanxian, String biaoshi) {
        this.id = id;
        this.user = user;
        this.caozuo = caozuo;
        this.ctime = ctime;
        this.url = url;
        this.qtype = qtype;
        this.canshu = canshu;
        this.uip = uip;
        this.quanxian = quanxian;
        this.biaoshi = biaoshi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCaozuo() {
        return caozuo;
    }

    public void setCaozuo(String caozuo) {
        this.caozuo = caozuo;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    public String getCanshu() {
        return canshu;
    }

    public void setCanshu(String canshu) {
        this.canshu = canshu;
    }

    public String getUip() {
        return uip;
    }

    public void setUip(String uip) {
        this.uip = uip;
    }

    public String getQuanxian() {
        return quanxian;
    }

    public void setQuanxian(String quanxian) {
        this.quanxian = quanxian;
    }

    public String getBiaoshi() {
        return biaoshi;
    }

    public void setBiaoshi(String biaoshi) {
        this.biaoshi = biaoshi;
    }
}
