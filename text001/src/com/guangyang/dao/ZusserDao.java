package com.guangyang.dao;

import com.guangyang.bean.Zusser;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public interface ZusserDao {
    /**
     * 获取所有类型数据
     * */
    public List<Zusser> getAll();
    /**
     * 获取第一级数据
     * */
    public List<Zusser> getParents();
    /**
     * 增加顶级类型
     * */
    public  void add(String name, String password);
    /**
     * 删除数据
     * */
    public void delete(int id);
    /**
     * 修改数据
     * */
    public void update(String name,String password);
    /**
     *
     * 通过ID查询数据
     * */
    public Zusser getById(int id);
}
