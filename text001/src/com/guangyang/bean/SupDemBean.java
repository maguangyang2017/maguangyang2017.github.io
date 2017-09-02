package com.guangyang.bean;

import java.sql.Timestamp;

public class SupDemBean {
    private int id;//编号
    private int uid;//发布人
    private String name;//发布人
    private User user;//发布人
    private String title;//标题
    private String titleImgUrl;//图片
    private String description;//简介
    private int price;//报价
    private String address;//详细地址
    private String content;//内容
    private int lid;//留言
    private Timestamp date;//发布时间
    private int type;//供求类型
    private int sdType;//0表示求购，1表示供应
    private String ssdType;//求购信息||供应信息
    private int status;//状态：0表示已删除，1表示正常
    private int fTypeId;//父类型id
    private int zTypeId;//子类型id

    public SupDemBean() {
    }

    public SupDemBean(int id, int uid, String name, User user, String title, String titleImgUrl, String description, int price, String address, String content, int lid, Timestamp date, int type, int sdType, String ssdType, int status, int fTypeId, int zTypeId) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.user = user;
        this.title = title;
        this.titleImgUrl = titleImgUrl;
        this.description = description;
        this.price = price;
        this.address = address;
        this.content = content;
        this.lid = lid;
        this.date = date;
        this.type = type;
        this.sdType = sdType;
        this.ssdType = ssdType;
        this.status = status;
        this.fTypeId = fTypeId;
        this.zTypeId = zTypeId;
    }

    @Override
    public String toString() {
        return "SupDemBean{" + "id=" + id + ", uid=" + uid + ", user=" + user + ", title='" + title + '\'' + ", description='" + description + '\'' + ", price=" + price + ", address='" + address + '\'' + ", lid=" + lid + ", date=" + date + ", type=" + type + ", sdType=" + sdType + ", status=" + status + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSdType() {
        return sdType;
    }

    public void setSdType(int sdType) {
        this.sdType = sdType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSsdType() {
        return ssdType;
    }

    public void setSsdType(String ssdType) {
        Integer i = Integer.parseInt(ssdType);
        if(i==0){
            this.ssdType="求购信息";
        }else if(i==1){
            this.ssdType="供应信息";
        }else if(i==2){
            this.ssdType="产品库";
        }else if(i==3){
            this.ssdType="公司库";
        }
    }

    public String getTitleImgUrl() {
        return titleImgUrl;
    }

    public void setTitleImgUrl(String titleImgUrl) {
        this.titleImgUrl = titleImgUrl;
    }

    public int getfTypeId() {
        return fTypeId;
    }

    public void setfTypeId(int fTypeId) {
        this.fTypeId = fTypeId;
    }

    public int getzTypeId() {
        return zTypeId;
    }

    public void setzTypeId(int zTypeId) {
        this.zTypeId = zTypeId;
    }
}
