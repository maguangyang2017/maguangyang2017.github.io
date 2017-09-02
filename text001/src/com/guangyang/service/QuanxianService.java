package com.guangyang.service;

import com.guangyang.bean.New;
import com.guangyang.bean.Permission;
import com.guangyang.bean.Quanxian;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public interface QuanxianService {
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
    public  void add(Permission permission);
    /**
     * 删除数据
     * */
    public  void delete(int id);

    /**
     * 修改数据
     * */
    public  void update(Permission permission);

    /**
     *
     * 通过ID查询数据
     * */
    public Permission getById(int id);
}
