package com.guangyang.service;

import com.guangyang.bean.Qiu;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/6.
 */
public interface QiuService {
    /**
     * 获取所有类型数据
     * */
    public List<Qiu> getAll();
    /**
     * 增加顶级类型
     * */
    public  void addGong(Qiu qiu);
    public Qiu getById(int id);
}