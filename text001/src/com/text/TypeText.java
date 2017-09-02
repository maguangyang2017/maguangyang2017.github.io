package com.text;

import com.guangyang.bean.Rizhi;
import com.guangyang.controller.RizhiFilterServlet;
import com.guangyang.dao.impl.TypeDaoImpl;
import com.guangyang.service.RizhiService;
import com.guangyang.service.impl.RizhiServiceImpl;
import org.testng.annotations.Test;


import java.util.List;

/**
 * Created by 马光阳 on 2017/7/12.
 */
public class TypeText {
    @Test
    public void textCount(){
        TypeDaoImpl typeDao = new TypeDaoImpl();
//        System.out.println(typeDao.getCount());
    }
    @Test
    public void testCo() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        RizhiService rizhiService = new RizhiServiceImpl() ;
//        rizhiService.add();

    }
}
