package com.guangyang.bean;


import java.sql.Timestamp;

/**
 * Created by 马光阳 on 2017/7/5.
 */
public class Gong {
    private int id;
    private String gtitle;
    private String lei;
    private Timestamp gtime;

    public Gong() {
    }

    public Gong(int id, String gtitle, String lei, Timestamp gtime) {
        this.id = id;
        this.gtitle = gtitle;
        this.lei = lei;
        this.gtime = gtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGtitle(String gtitle) {
        return gtitle;
    }

    public void setGtitle(String gtitle) {
        this.gtitle = gtitle;
    }

    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

    public Timestamp getGtime() {
        return gtime;
    }

    public void setGtime(Timestamp gtime) {
        this.gtime = gtime;
    }

    public String getGtitle() {
        return gtitle;
    }
}
