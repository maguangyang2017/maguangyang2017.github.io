package com.guangyang.service.impl;

import com.guangyang.bean.Type;
import com.guangyang.dao.ShouyeTypeDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.ShouyeTypeService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/16.
 */
public class ShouyeTypeServiceImpl implements ShouyeTypeService{
    ShouyeTypeDao shouyeTypeDao = BeanFactory.getInstance("shouyeTypeDao",ShouyeTypeDao.class);
    @Override
    public List<Type> getParents(int pid) {
        return shouyeTypeDao.getParents(pid);
    }

    @Override
    public List<Type> getById(int pid) {
        return shouyeTypeDao.getById(pid);
    }
}
