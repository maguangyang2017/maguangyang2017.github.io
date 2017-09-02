package com.guangyang.dao;

import com.guangyang.bean.Qiu;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/6.
 */
public interface QiuDao {
    /**
     * 获取所有类型数据
     * */
    public List<Qiu> getAll();
    /**
     * 增加顶级类型
     * */
    public Qiu addGong(String qtitle);
    public Qiu getById(int id);
}
