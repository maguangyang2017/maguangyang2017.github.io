package com.guangyang.service.impl;

import com.guangyang.bean.AdminUser;
import com.guangyang.bean.Ti;
import com.guangyang.dao.ITiDao;
import com.guangyang.dao.YonghuDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.YonghuService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public class YonghuServiceImpl implements YonghuService {
    YonghuDao yonghuDao = BeanFactory.getInstance("yonghuDao",YonghuDao.class);
    @Override
    public List<AdminUser> getAll() {
        return yonghuDao.getAll();
    }

    @Override
    public List<AdminUser> getParents() {
        return null;
    }

    @Override
    public void add(AdminUser adminUser) {
        yonghuDao.add(adminUser.getUsername(),adminUser.getPassword());
    }

    @Override
    public void deleteType(int id) {
        yonghuDao.delete(id);
    }

    @Override
    public void update(AdminUser adminUser) {

    }

    @Override
    public AdminUser getTypeById(int id) {
        return yonghuDao.getById(id);
    }
}
