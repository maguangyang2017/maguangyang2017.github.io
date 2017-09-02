package com.guangyang.service.impl;

import com.guangyang.bean.SetQuan;
import com.guangyang.dao.SetQuanDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.SetQuanService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class SetQuanServiceImpl implements SetQuanService{
    SetQuanDao setQuanDao = BeanFactory.getInstance("setQuanDao",SetQuanDao.class);
    public SetQuanServiceImpl() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    }
    @Override
    public List<SetQuan> getUrl(int id) {
        return setQuanDao.getUrl(id);
    }
}
