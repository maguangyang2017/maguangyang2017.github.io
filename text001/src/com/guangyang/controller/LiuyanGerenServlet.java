package com.guangyang.controller;

import com.guangyang.bean.Liuyan;
import com.guangyang.bean.SupDemBean;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.LiuYanservice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/19.
 */
public class LiuyanGerenServlet extends HttpServlet{
    LiuYanservice liuYanService = BeanFactory.getInstance("liuYanService",LiuYanservice.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("m");
        if ("add".equals(method)) {
            add(req, resp);
        }else if ("getall".equals(method)){
            getAll(req, resp);
        }
    }
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=UTF-8");
        List<Liuyan> newList = liuYanService.getAll();

        req.setAttribute("liuyan", newList);
//        resp.getWriter().write(JSON.toJSONString(newList));

        this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/liuyan.jsp").forward(req, resp);

    }
    public void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/json;charset=UTF-8");
//        List<Liuyan> newList = liuYanService.getAll();
//        req.setAttribute("liuyan", newList);
//        this.getServletConfig().getServletContext().getRequestDispatcher("/liuyan.jsp").forward(req, resp);

    }
}
