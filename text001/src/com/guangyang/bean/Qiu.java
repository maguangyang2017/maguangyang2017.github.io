package com.guangyang.bean;

import java.sql.Timestamp;

/**
 * Created by 马光阳 on 2017/7/5.
 */
public class Qiu {
    private int id;
    private String qtitle;
    private Timestamp qtime;
    private String qlei;
    private String neirong;

    public Qiu() {
    }

    public Qiu(int id, String qtitle, Timestamp qtime, String qlei, String neirong) {
        this.id = id;
        this.qtitle = qtitle;
        this.qtime = qtime;
        this.qlei = qlei;
        this.neirong = neirong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQtitle() {
        return qtitle;
    }

    public void setQtitle(String qtitle) {
        this.qtitle = qtitle;
    }

    public Timestamp getQtime() {
        return qtime;
    }

    public void setQtime(Timestamp qtime) {
        this.qtime = qtime;
    }

    public String getQlei() {
        return qlei;
    }

    public void setQlei(String qlei) {
        this.qlei = qlei;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }
}
