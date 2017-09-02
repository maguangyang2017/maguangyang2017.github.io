package com.guangyang.service;

import com.guangyang.bean.Wenben;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/11.
 */
public interface WenbenService {
    /**
     * 获取所有类型数据
     * */
    public List<Wenben> getAll();
    /**
     * 获取第一级数据
     * */
    public List<Wenben> getParents();
    /**
     * 增加顶级类型
     * */
    public  void addType(Wenben wenben);
    /**
     * 删除数据
     * */
    public  void deleteType(int id);

    /**
     * 修改数据
     * */
    public  void update(Wenben wenben);

    /**
     *
     * 通过ID查询数据
     * */
    public Wenben getTypeById(int id);
}
