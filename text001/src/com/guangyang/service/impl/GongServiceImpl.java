package com.guangyang.service.impl;

import com.guangyang.bean.Gong;
import com.guangyang.dao.GongDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.GongService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/5.
 */
public class GongServiceImpl implements GongService{
    GongDao gongDao = BeanFactory.getInstance("gongDao",GongDao.class);
    @Override
    public List<Gong> getAll() {
        return gongDao.getAll();
    }

    @Override
    public void addGong(String tijiao) {
        gongDao.addGong(tijiao);
    }

    @Override
    public Gong getById(int id) {
        return gongDao.getById(id);
    }

    @Override
    public List<Gong> getAllInfo(int page) {
        return gongDao.getAllInfo(page);
    }
    public int getCount() {
        return gongDao.getCount();
    }

//    @Override
//    public List<Gong> getPageNumber(int page, int showNumber) {
//        return gongDao.getPageNumber(page,showNumber);
//    }

//    @Override
//    public void addGong(Gong gong) {
//        gongDao.addGong(gong.getGtitle("tijiao"));
//    }

}
