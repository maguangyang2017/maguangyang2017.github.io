package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Rizhi;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.RizhiService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class RizhiServlet extends HttpServlet{
    RizhiService rizhiService = BeanFactory.getInstance("rizhiService",RizhiService.class);
    public RizhiServlet() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json; charset=UTF-8");
        List<Rizhi> list = rizhiService.getALL();
        String json = JSON.toJSONString(list);
        resp.getWriter().write(json);
    }
}
