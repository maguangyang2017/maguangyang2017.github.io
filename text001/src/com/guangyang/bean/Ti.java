package com.guangyang.bean;

/**
 * Created by Lenovo on 2017/7/2.
 */
public class Ti {
    private int id;
    private String name;
    private String password;
    private String shangwu;
    private String anquan;
    private String shouji;
    private int status;

    public Ti() {
    }

    public Ti(int id, String name, String password, String shangwu, String anquan, String shouji, int status) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.shangwu = shangwu;
        this.anquan = anquan;
        this.shouji = shouji;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShangwu() {
        return shangwu;
    }

    public void setShangwu(String shangwu) {
        this.shangwu = shangwu;
    }

    public String getAnquan() {
        return anquan;
    }

    public void setAnquan(String anquan) {
        this.anquan = anquan;
    }

    public String getShouji() {
        return shouji;
    }

    public void setShouji(String shouji) {
        this.shouji = shouji;
    }

    @Override
    public String toString() {
        return "Ti{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", shangwu='" + shangwu + '\'' +
                ", anquan='" + anquan + '\'' +
                ", shouji='" + shouji + '\'' +
                ", status=" + status +
                '}';
    }
}
