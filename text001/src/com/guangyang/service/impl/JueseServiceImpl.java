package com.guangyang.service.impl;

import com.guangyang.bean.Juese;
import com.guangyang.dao.JueseDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.JueseService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public class JueseServiceImpl implements JueseService{
    JueseDao jueseDao = BeanFactory.getInstance("jueseDao",JueseDao.class);
    @Override
    public List<Juese> getAll() {
        return jueseDao.getAll();
    }

    @Override
    public List<Juese> getParents() {
        return null;
    }

    @Override
    public void add(Juese juese) {
        jueseDao.add(juese.getName());
    }

    @Override
    public void delete(int id) {
        jueseDao.delete(id);
    }

    @Override
    public void update(Juese juese) {
        jueseDao.update(juese.getId(),juese.getName());
    }

    @Override
    public Juese getById(int id) {
        return jueseDao.getById(id);
    }

    @Override
    public void setPower(int roleid, String[] powerids) {
        jueseDao.setPower(roleid,powerids);
    }
}
