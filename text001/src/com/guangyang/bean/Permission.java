package com.guangyang.bean;

/**
 * Created by 马光阳 on 2017/7/8.
 */
public class Permission {
    private int id;
    private String name;
    private String url;
    private int type;
    private int pId;
    private int status;

    public Permission() {
    }

    public Permission(int id, String name, String url, int type, int pId, int status) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.type = type;
        this.pId = pId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
