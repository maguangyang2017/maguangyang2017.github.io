package com.guangyang.service.impl;


import com.guangyang.bean.New;
import com.guangyang.bean.SupDemBean;
import com.guangyang.dao.ISouSuoDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.Service;

import java.util.List;

public class SuoSuoService implements Service<Integer> {
    ISouSuoDao iSouSuoDao = BeanFactory.getInstance("iSouSuoDao",ISouSuoDao.class);
    @Override
    public void save(Integer model) {

    }

    @Override
    public void save(List<Integer> models) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(Integer model) {

    }

    @Override
    public Integer findById(Integer id) {
        return null;
    }

    @Override
    public Integer findBy(String property, Object value) {
        return null;
    }

    @Override
    public List<Integer> findByIds(String ids) {
        return null;
    }
    public List<New> getNews(String like) {
        return iSouSuoDao.getNews(like);
    }
    public List<SupDemBean> getSupDem(String like) {
        return iSouSuoDao.getSupDems(like);
    }

    @Override
    public List<Integer> findByCondition(String condition) {
        return null;
    }

    @Override
    public List<Integer> findAll() {
        return null;
    }
}
