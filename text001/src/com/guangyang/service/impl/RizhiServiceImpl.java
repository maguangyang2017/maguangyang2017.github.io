package com.guangyang.service.impl;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Rizhi;
import com.guangyang.dao.RizhiDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.RizhiService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class RizhiServiceImpl implements RizhiService {
    RizhiDao rizhiDao = BeanFactory.getInstance("rizhiDao",RizhiDao.class);
    public RizhiServiceImpl() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    }
    @Override
    public void add(Rizhi rizhi) {
        System.out.print("789789789");
        System.out.print(rizhi);
        rizhiDao.add(rizhi);

    }

    @Override
    public List<Rizhi> getALL() {
        ;
        return rizhiDao.getAll();

    }
}
