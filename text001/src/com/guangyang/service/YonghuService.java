package com.guangyang.service;

import com.guangyang.bean.AdminUser;
import com.guangyang.bean.Ti;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public interface YonghuService {
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
    public  void add(AdminUser adminUser);
    /**
     * 删除数据
     * */
    public  void deleteType(int id);

    /**
     * 修改数据
     * */
    public  void update(AdminUser adminUser);

    /**
     *
     * 通过ID查询数据
     * */
    public AdminUser getTypeById(int id);
}
