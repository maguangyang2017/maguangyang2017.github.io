package com.guangyang.service;

import com.guangyang.bean.New;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/2.
 */
public interface NewService {
    /**
     * 获取所有类型数据
     * */
    public List<New> getAll();
    /**
     * 获取第一级数据
     * */
    public List<New> getParents();
    /**
     * 增加顶级类型
     * */
    public  void addNew(New news);
    /**
     * 删除数据
     * */
    public  void deleteNew(int id);

    /**
     * 修改数据
     * */
    public  void update(New news);

    /**
     *
     * 通过ID查询数据
     * */
    public New getNewById(int id);
}
