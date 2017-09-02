package com.guangyang.service.impl;


import com.guangyang.bean.Ti;
import com.guangyang.dao.ITiDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.ITiService;

import java.util.List;

/**
 * Created by Lenovo on 2017/7/2.
 */
public class TiServiceImpl implements ITiService {
    ITiDao iTiDao = BeanFactory.getInstance("tiDao",ITiDao.class);

    public TiServiceImpl() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    }

    @Override
    public void addTi(String name, String password, String shangwu, String anquan, String shouji) {
        System.out.println(name+password);
        int re = iTiDao.addti(name,password,shangwu,anquan,shouji);
    }

    @Override
    public Ti getById(int id) {
        return iTiDao.getById(id);
    }

    @Override
    public List<Ti> getAll() {
        return iTiDao.getAll();
    }
}
