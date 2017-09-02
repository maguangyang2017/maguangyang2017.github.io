package com.guangyang.service.impl;

import com.guangyang.bean.New;
import com.guangyang.dao.NewDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.NewService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/2.
 */
public class NewServiceImpl implements NewService{
    NewDao newDao = BeanFactory.getInstance("newDao",NewDao.class);

    @Override
    public List<New> getAll() {
        return newDao.getAll();
    }

    @Override
    public List<New> getParents() {
        return null;
    }

    @Override
    public void addNew(New news) {
        newDao.addNew(news.getTitle(),news.getContent());
    }

    @Override
    public void deleteNew(int id) {
        newDao.deleteNew(id);
    }


    @Override
    public void update(New news) {
        newDao.update(news.getId(),news.getTitle(),news.getContent());
    }

    @Override
    public New getNewById(int id) {
        return newDao.getNewById(id);
    }
}
