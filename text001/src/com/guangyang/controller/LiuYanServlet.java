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


public class LiuYanServlet extends HttpServlet {
    LiuYanservice liuYanService = BeanFactory.getInstance("liuYanService",LiuYanservice.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("m");
        if ("qiu".equals(method)){
            qiu(req,resp);
        } else if ("gong".equals(method)){
            gong(req,resp);
        }
    }
//    求购留言
    public void qiu(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Liuyan liuyan = new Liuyan();
        int type = 1;
        int xid = Integer.parseInt(req.getParameter("xid"));
        String name = req.getParameter("name");
        String dian = req.getParameter("dian");
        String shou = req.getParameter("shou");
        String you = req.getParameter("you");
        String content = req.getParameter("content");
        liuyan.setType(type);
        liuyan.setXid(xid);
        liuyan.setName(name);
        liuyan.setDian(dian);
        liuyan.setShou(shou);
        liuyan.setYou(you);
        liuyan.setContent(content);
        liuYanService.add(liuyan);


//        System.out.println(JSON.toJSONString(liuyan));
//        System.out.println("**********-**********");
        resp.setContentType("text/json; charset=UTF-8");
        String json = JSON.toJSONString("留言成功");
        resp.getWriter().write(json);
    }
//    供应留言
    public void gong(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Liuyan liuyan = new Liuyan();
        int type = 2;
        int xid = Integer.parseInt(req.getParameter("xid"));
        String name = req.getParameter("name");
        String dian = req.getParameter("dian");
        String shou = req.getParameter("shou");
        String you = req.getParameter("you");
        String content = req.getParameter("content");
        liuyan.setType(type);
        liuyan.setXid(xid);
        liuyan.setName(name);
        liuyan.setDian(dian);
        liuyan.setShou(shou);
        liuyan.setYou(you);
        liuyan.setContent(content);
        liuYanService.add(liuyan);
        resp.setContentType("text/json; charset=UTF-8");
        String json = JSON.toJSONString("留言成功");
        resp.getWriter().write(json);
    }
}
