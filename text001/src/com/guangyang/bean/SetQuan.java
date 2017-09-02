package com.guangyang.bean;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class SetQuan {
    private String url;

    public SetQuan() {
    }

    public SetQuan(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SetQuan{" +
                "url='" + url + '\'' +
                '}';
    }
}
