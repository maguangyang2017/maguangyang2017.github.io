package com.guangyang.service.impl;
import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Permission;
import com.guangyang.bean.Quanxian;
import com.guangyang.dao.QuanxianDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.QuanxianService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public class QuanxianServiceImpl implements QuanxianService{
    QuanxianDao quanxianDao = BeanFactory.getInstance("quanxianDao",QuanxianDao.class);

    @Override
    public List<Permission> getAll() {
        System.out.println(JSON.toJSONString(quanxianDao.getAll()));
        return quanxianDao.getAll();
    }

    @Override
    public List<Permission> getParents() {
        return null;
    }

    @Override
    public void add(Permission permission) {
        quanxianDao.add(permission.getName(),permission.getUrl(),permission.getType(),permission.getPId());
    }

    @Override
    public void delete(int id) {
        quanxianDao.delete(id);

    }

    @Override
    public void update(Permission permission) {
        quanxianDao.update(permission.getId(),permission.getName(),permission.getUrl(),permission.getType(),permission.getPId(),permission.getStatus());

    }

    @Override
    public Permission getById(int id) {
        return null;
    }
}
