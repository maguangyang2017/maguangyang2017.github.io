package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.New;
import com.guangyang.bean.SupDemBean;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.Service;
import com.guangyang.service.impl.SuoSuoService;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SouSuoServlet extends HttpServlet {
    Service<Integer> service = BeanFactory.getInstance("service",Service.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String m = req.getParameter("m");
        if("ssnews".equals(m)){
            ssnews(req,resp);
        }else if("ssb2b".equals(m)){
            ssb2b(req,resp);
        }else if("sousuo".equals(m)){
            sousuo(req,resp);
        }
    }

    protected String ssnews(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String like = req.getParameter("guanjianzi");
        SuoSuoService suoSuoService = (SuoSuoService)service;
        resp.setContentType("text/json;charset=utf-8");
        List<New> list = suoSuoService.getNews(like);
        req.setAttribute("newss",list);
        String json = JSON.toJSONString(list);
        System.out.println(json);
        resp.getWriter().write(json);
        return json;
    }

    protected String ssb2b(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String like = req.getParameter("guanjianzi");
        SuoSuoService suoSuoService = (SuoSuoService)service;
        resp.setContentType("text/json;charset=utf-8");
        List<SupDemBean> list = suoSuoService.getSupDem(like);
        req.setAttribute("newss",list);
        String json = JSON.toJSONString(list);
        System.out.println(json);
        resp.getWriter().write(json);
        return json;
    }

    protected void sousuo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        String s1 = req.getParameter("select1");
        String guanjianzi = req.getParameter("guanjianzi");
        req.setAttribute("select1",s1);
        req.setAttribute("guanjianzi",guanjianzi);
        System.out.println(s1+"   "+guanjianzi);
        this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/sousuo.jsp").forward(req,resp);
    }
}
