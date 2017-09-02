package com.guangyang.service.impl;

import com.guangyang.bean.Wenben;
import com.guangyang.dao.WenbenDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.WenbenService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/11.
 */
public class WenbenServiceImpl implements WenbenService{
    WenbenDao wenbenDao = BeanFactory.getInstance("wenbenDao",WenbenDao.class);
    @Override
    public List<Wenben> getAll() {
        return wenbenDao.getAll();
    }

    @Override
    public List<Wenben> getParents() {
        return null;
    }

    @Override
    public void addType(Wenben wenben) {
        wenbenDao.add(wenben.getWenben());
    }

    @Override
    public void deleteType(int id) {
        wenbenDao.delete(id);
    }

    @Override
    public void update(Wenben wenben) {
        wenbenDao.update(wenben.getId(),wenben.getWenben());
    }

    @Override
    public Wenben getTypeById(int id) {
        return wenbenDao.getById(id);
    }
}
