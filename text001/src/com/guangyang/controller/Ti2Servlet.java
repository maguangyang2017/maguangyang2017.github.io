package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Ti;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.ITiService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/16.
 */
public class Ti2Servlet extends HttpServlet{
    ITiService iTiService = BeanFactory.getInstance("tiService",ITiService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String method = req.getParameter("m");
        if ("getbyid".equals(method)){
            geteId(req, resp);
        }else if ("getall".equals(method)){
            getAll(req,resp);
        }
    }
    public void geteId(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Ti ti = iTiService.getById(id);
        req.setAttribute("ti2",ti);
//        System.out.println("22222222222222222222");
//        List<Ti> newList = iTiService.getAll();
//        req.setAttribute("ti", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/gongqiu/gongneirong.jsp").forward(req,resp);

    }
    public void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ti> newList = iTiService.getAll();
        System.out.println("1");
        req.setAttribute("ti1", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/qiantaidenglu/ziliao.jsp").forward(req, resp);
    }
}
