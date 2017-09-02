package com.guangyang.service;

import com.guangyang.bean.Juese;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public interface JueseService {
    /**
     * 获取所有类型数据
     * */
    public List<Juese> getAll();
    /**
     * 获取第一级数据
     * */
    public List<Juese> getParents();
    /**
     * 增加顶级类型
     * */
    public  void add(Juese juese);
    /**
     * 删除数据
     * */
    public  void delete(int id);

    /**
     * 修改数据
     * */
    public  void update(Juese juese);

    /**
     *
     * 通过ID查询数据
     * */
    public Juese getById(int id);
    public void setPower(int roleid, String[] powerids);
}
