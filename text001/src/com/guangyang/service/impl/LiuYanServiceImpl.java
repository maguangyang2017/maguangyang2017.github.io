package com.guangyang.service.impl;


import com.guangyang.bean.Liuyan;
import com.guangyang.dao.LiuYanDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.LiuYanservice;

import java.util.List;

public class LiuYanServiceImpl implements LiuYanservice {
    LiuYanDao liuYanDao = BeanFactory.getInstance("liuYanDao",LiuYanDao.class);
    //添加
    @Override
    public void add(Liuyan liuyan) {
        liuYanDao.add(liuyan.getType(),liuyan.getXid(),liuyan.getName(),liuyan.getDian(),liuyan.getShou(),liuyan.getYou(),liuyan.getContent());
    }

    @Override
    public List<Liuyan> getAll() {
        return liuYanDao.getAll();
    }
}
