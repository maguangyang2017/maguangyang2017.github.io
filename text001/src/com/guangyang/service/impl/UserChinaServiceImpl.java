package com.guangyang.service.impl;

import com.guangyang.bean.User;
import com.guangyang.bean.UsersChina;
import com.guangyang.dao.UserChinaDao;
import com.guangyang.dao.impl.UserChinaDaoImpl;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.UserChinaService;

import java.util.List;
import java.util.Map;

/**
 * Created by 马光阳 on 2017/7/14.
 */
public class UserChinaServiceImpl implements UserChinaService{
    UserChinaDao userChinaDao = BeanFactory.getInstance("userChinaDao",UserChinaDao.class);
    @Override
    public List<UsersChina> getPId() {
        return userChinaDao.getPid();
    }
    public Map<String, String> sCDao(String id) {
        return userChinaDao.selectChina(id);
    }
}
