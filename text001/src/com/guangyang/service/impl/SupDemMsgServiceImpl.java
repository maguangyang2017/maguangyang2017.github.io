package com.guangyang.service.impl;



import com.guangyang.bean.SupDemBean;
import com.guangyang.dao.ISupDemDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.Service;

import java.util.List;

public class SupDemMsgServiceImpl implements Service<SupDemBean> {
    ISupDemDao iSupDemDao = BeanFactory.getInstance("supDemDao", ISupDemDao.class);
    @Override
    public void save(SupDemBean model) {
        iSupDemDao.add(model);
    }

    @Override
    public void save(List<SupDemBean> models) {

    }

    @Override
    public void deleteById(Integer id) {
        iSupDemDao.delete(id);
    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(SupDemBean model) {
        iSupDemDao.update(model);
    }

    @Override
    public SupDemBean findById(Integer id) {
        return iSupDemDao.getSupDem(id);
    }

    @Override
    public SupDemBean findBy(String property, Object value) {
        return null;
    }

    @Override
    public List<SupDemBean> findByIds(String ids) {
        return null;
    }

    @Override
    public List<SupDemBean> findByCondition(String condition) {
        return iSupDemDao.getAll(condition);
    }

    public List<SupDemBean> getByCondition(String condition) {
        return iSupDemDao.getByCondition(condition);
    }
    @Override
    public List<SupDemBean> findAll() {
        return iSupDemDao.getSupDemAll();
    }
}
