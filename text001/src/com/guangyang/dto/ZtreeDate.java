package com.guangyang.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2017/7/8.
 */
public class ZtreeDate {
    private String name;
    private boolean checked;
    private int id;
    private int pId;
    private boolean open = true;
//    private List<ZtreeDate> children = new ArrayList<ZtreeDate>();


    public ZtreeDate() {
    }

    public ZtreeDate(String name, boolean checked, int id, int pId, boolean open) {
        this.name = name;
        this.checked = checked;
        this.id = id;
        this.pId = pId;
        this.open = open;
//        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

//    public List<ZtreeDate> getChildren() {
//        return children;
//    }
//
//    public void setChildren(List<ZtreeDate> children) {
//        this.children = children;
//    }

    @Override
    public String toString() {
        return "ZtreeDate{" +
                "name='" + name + '\'' +
                ", checked=" + checked +
                ", id=" + id +
                ", pId=" + pId +
                ", open=" + open +
//                ", children=" + children +
                '}';
    }
}
