package com.guangyang.bean;

import java.sql.Timestamp;

/**
 * Created by 马光阳 on 2017/7/10.
 */
public class Wenben {
    private int id;
    private String wenben;
    private Timestamp ctime;

    public Wenben() {
    }

    public Wenben(int id, String wenben, Timestamp ctime) {
        this.id = id;
        this.wenben = wenben;
        this.ctime = ctime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWenben() {
        return wenben;
    }

    public void setWenben(String wenben) {
        this.wenben = wenben;
    }

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }
}
