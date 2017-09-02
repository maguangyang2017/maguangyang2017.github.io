package com.guangyang.service;

import com.guangyang.bean.SupDemBean;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/17.
 */
public interface FabuService {
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
    public  void add(SupDemBean supDemBean);
    /**
     * 删除数据
     * */
    public  void delete(int id);

    /**
     * 修改数据
     * */
    public  void update(SupDemBean supDemBean);

    /**
     *
     * 通过ID查询数据
     * */
    public SupDemBean getNewById(int id);
}
