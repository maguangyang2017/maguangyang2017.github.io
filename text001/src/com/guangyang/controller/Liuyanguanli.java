package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Liuyan;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.LiuYanservice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/20.
 */
public class Liuyanguanli extends HttpServlet{
    LiuYanservice liuYanService = BeanFactory.getInstance("liuYanService",LiuYanservice.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("m");
         if ("getall".equals(method)){
            getAll(req, resp);
        }
    }
    public void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=UTF-8");
        List<Liuyan> newList = liuYanService.getAll();
        String json = JSON.toJSONString(newList);
        resp.getWriter().write(json);
//        req.setAttribute("liuyan", newList);
//        this.getServletConfig().getServletContext().getRequestDispatcher("/liuyan.jsp").forward(req, resp);

    }
}
