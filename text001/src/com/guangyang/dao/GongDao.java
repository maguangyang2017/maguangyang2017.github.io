package com.guangyang.dao;

import com.guangyang.bean.Gong;
import com.guangyang.bean.New;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/5.
 */
public interface GongDao {
    /**
     * 获取所有类型数据
     * */
    public List<Gong> getAll();
    /**
     * 增加顶级类型
     * */
    public Gong addGong(String tijiao);
//    public List<Gong> getPageNumber(int page ,int showNumber);
    public Gong getById(int id);
    public List<Gong> getAllInfo(int page);
    public int getCount();
}
