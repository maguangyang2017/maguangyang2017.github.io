package com.guangyang.bean;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class Message {
    public int status;
    public String message;

    public Message() {
    }

    public Message(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
