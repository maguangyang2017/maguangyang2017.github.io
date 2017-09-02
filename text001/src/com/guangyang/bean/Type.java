package com.guangyang.bean;


import java.sql.Timestamp;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class Type {
    private int id;
    private String title;
    private int pid;
    private String description;
    private Timestamp create_time;

    public Type() {
    }

    public Type(int id, String title, int pid, String description, Timestamp create_time) {
        this.id = id;
        this.title = title;
        this.pid = pid;
        this.description = description;
        this.create_time = create_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }
}
