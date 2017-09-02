package com.guangyang.dao;



import com.guangyang.bean.SupDemBean;

import java.util.List;

public interface ISupDemDao {
    //所有供求信息
    List<SupDemBean> getAll(String sdType);
    //添加供求信息
    void add(SupDemBean supDemBean);
    //获取一条，by ID
    SupDemBean getSupDem(Integer id);
    public List<SupDemBean> getSupDemAll();
    public void delete(Integer id);
    public void update(SupDemBean supDem);
    public List<SupDemBean> getByCondition(String condition);
}
