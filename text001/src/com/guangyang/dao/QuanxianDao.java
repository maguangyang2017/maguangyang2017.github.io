package com.guangyang.dao;

import com.guangyang.bean.Permission;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public interface QuanxianDao {
    /**
     * 获取所有类型数据
     * */
    public List<Permission> getAll();
    /**
     * 获取第一级数据
     * */
    public List<Permission> getParents();
    /**
     * 增加顶级类型
     * */
    public  void add(String name ,String url,int type ,int pId);
    /**
     * 删除数据
     * */
    public void delete(int id);
    /**
     * 修改数据
     * */
    public void update(int id,String name,String url,int type,int pId,int status);
    /**
     *
     * 通过ID查询数据
     * */
    public Permission getById(int id);
}
