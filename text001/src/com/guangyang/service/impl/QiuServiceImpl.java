package com.guangyang.service.impl;

import com.guangyang.bean.Qiu;
import com.guangyang.dao.QiuDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.QiuService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/6.
 */
public class QiuServiceImpl implements QiuService{
    QiuDao qiuDao = BeanFactory.getInstance("qiuDao",QiuDao.class);
    @Override
    public List<Qiu> getAll() {
        return qiuDao.getAll();
    }

    @Override
    public void addGong(Qiu qiu) {
        qiuDao.addGong(qiu.getQtitle());
    }

    @Override
    public Qiu getById(int id) {
        return qiuDao.getById(id);
    }


}
