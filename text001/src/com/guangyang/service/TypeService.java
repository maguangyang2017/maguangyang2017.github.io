package com.guangyang.service;

import com.guangyang.bean.Type;

import java.util.List;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public interface TypeService {
    /**
     * 获取所有类型数据
     * */
    public  List<Type> getAll();
    /**
     * 获取第一级数据
     * */
    public List<Type> getParents(int pid);
    /**
     * 增加顶级类型
     * */
    public  void addType(Type type);
    /**
     * 删除数据
     * */
    public  void deleteType(int id);

    /**
     * 修改数据
     * */
    public  void update(Type type);

    /**
     *
     * 通过ID查询数据
     * */
    public  Type getTypeById(int id);
    //查询一个类型
    public  Type selectType(int id);
    //查询父类型
    public List<Type> getSupplyType(int id);
}
