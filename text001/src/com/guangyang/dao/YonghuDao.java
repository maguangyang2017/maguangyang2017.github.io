package com.guangyang.dao;

import com.guangyang.bean.AdminUser;
import com.guangyang.bean.Ti;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public interface YonghuDao {
    /**
     * 获取所有类型数据
     * */
    public List<AdminUser> getAll();
    /**
     * 获取第一级数据
     * */
    public List<AdminUser> getParents();
    /**
     * 增加顶级类型
     * */
    public  void add(String username, String password);
    /**
     * 删除数据
     * */
    public void delete(int id);
    /**
     * 修改数据
     * */
    public void update(int id,String username, String password, String loginip, String ctime, String status);
    /**
     *
     * 通过ID查询数据
     * */
    public AdminUser getById(int id);
}
