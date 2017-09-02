package com.guangyang.service.impl;

import com.guangyang.bean.Permission;
import com.guangyang.dao.PermissionDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.PermissionService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/10.
 */
public class PermissionServiceImpl implements PermissionService{
    PermissionDao permissionDao = BeanFactory.getInstance("permissionDao",PermissionDao.class);
    @Override
    public List<Permission> getAll() {
        return null;
    }
}
