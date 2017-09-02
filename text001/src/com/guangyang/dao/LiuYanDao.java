package com.guangyang.dao;

import com.guangyang.bean.Liuyan;

import java.util.List;

/**
 * Created by Administrator on 2017/7/16.
 */
public interface LiuYanDao {
    //添加
    public void add(int type, int xid, String name, String dian, String shou, String you, String content);
    public List<Liuyan> getAll();

}
