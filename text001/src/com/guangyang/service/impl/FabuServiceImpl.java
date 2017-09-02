package com.guangyang.service.impl;

import com.guangyang.bean.SupDemBean;
import com.guangyang.dao.FabuDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.FabuService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/17.
 */
public class FabuServiceImpl implements FabuService{
    FabuDao fabuDao = BeanFactory.getInstance("fabuDao",FabuDao.class);
    @Override
    public List<SupDemBean> getAll() {
        return fabuDao.getAll();
    }

    @Override
    public List<SupDemBean> getParents() {
        return null;
    }

    @Override
    public void add(SupDemBean supDemBean) {
        fabuDao.add(supDemBean.getTitle(),supDemBean.getDescription(),supDemBean.getPrice(),supDemBean.getAddress(),supDemBean.getContent());
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(SupDemBean supDemBean) {

    }

    @Override
    public SupDemBean getNewById(int id) {
        return null;
    }
}
