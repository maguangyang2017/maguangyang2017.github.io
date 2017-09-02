package com.guangyang.service;

import com.guangyang.bean.Gong;
import com.guangyang.bean.New;
import com.guangyang.bean.Type;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/5.
 */
public interface GongService {
    /**
     * 获取所有类型数据
     * */
    public List<Gong> getAll();
    /**
     * 增加顶级类型
     * */
//    public  void addGong(Gong gong);

    public  void addGong(String tijiao);

    public Gong getById(int id);
//    public List<Gong> getPageNumber(int page ,int showNumber);
    public List<Gong> getAllInfo(int page);
    public int getCount();
}
