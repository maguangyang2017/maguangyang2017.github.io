package com.guangyang.dao;

import com.guangyang.bean.SupDemBean;
import com.guangyang.bean.User;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/17.
 */
public interface FabuDao {
    /**
     * 获取所有类型数据
     * */
    public List<SupDemBean> getAll();
    /**
     * 获取第一级数据
     * */
    public List<SupDemBean> getParents();
    /**
     * 增加顶级类型
     * */
    public  void add( String title, String description, int price, String address, String content);
    /**
     * 删除数据
     * */
    public void delete(int id);
    /**
     * 修改数据
     * */
    public void update(int id,String title, String description, int price, String address, String content);
    /**
     *
     * 通过ID查询数据
     * */
    public SupDemBean getById(int id);
}
