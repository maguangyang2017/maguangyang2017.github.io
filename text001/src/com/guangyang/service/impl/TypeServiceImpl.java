package com.guangyang.service.impl;

import com.guangyang.bean.Type;
import com.guangyang.dao.TypeDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.TypeService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class TypeServiceImpl implements TypeService{
    TypeDao typeDao = BeanFactory.getInstance("typeDao",TypeDao.class);

    @Override
    public List<Type> getAll() {
        return typeDao.getAll();
    }

    @Override
    public List<Type> getParents(int pid) {
        return typeDao.getParents();
    }

    @Override
    public void addType(Type type) {
        typeDao.addType(type.getTitle(),type.getDescription(),type.getPid());
    }

    @Override
    public void deleteType(int id) {
        typeDao.deleteType(id);
    }

    @Override
    public void update(Type type) {
        typeDao.update(type.getId(),type.getTitle(),type.getDescription(),type.getPid());
    }

    @Override
    public Type getTypeById(int id) {
        return typeDao.getTypeById(id);
    }

    @Override
    public Type selectType(int id) {
        return typeDao.selectType(id);
    }

    @Override
    public List<Type> getSupplyType(int id) {
        return typeDao.getSupplyType(id);
    }
}
