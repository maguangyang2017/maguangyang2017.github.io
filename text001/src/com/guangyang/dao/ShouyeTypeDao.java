package com.guangyang.dao;

import com.guangyang.bean.Type;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/16.
 */
public interface ShouyeTypeDao {
    //    父级
    public List<Type> getParents(int pid);
    //    子级
    public List<Type> getById(int pid);
}
