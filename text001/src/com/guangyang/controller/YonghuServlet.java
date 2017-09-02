package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.guangyang.bean.AdminUser;
import com.guangyang.bean.Juese;
import com.guangyang.bean.Ti;
import com.guangyang.dto.ZtreeDate;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.YonghuService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public class YonghuServlet extends HttpServlet{
    YonghuService yonghuService = BeanFactory.getInstance("yonghuService",YonghuService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("m");
        if ("ajax_all".equals(method)) {
            ajaxAll(req, resp);
        } else if ("delete".equals(method)) {
            delete(req, resp);
        }else if ("all".equals(method)){
            all(req,resp);
        }else if ("add".equals(method)){
            add(req,resp);
        }else {
            index(req, resp);
        }
//        else if ("getbyid".equals(method)) {
//            geteById(req,resp);
//        }

    }
    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<AdminUser> typeList = yonghuService.getAll();
        req.setAttribute("ti", typeList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);

    }


    public void ajaxAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<AdminUser> typeList = yonghuService.getAll();
        String json = JSON.toJSONString(typeList);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write(json);

    }

    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        yonghuService.deleteType(Integer.parseInt(req.getParameter("id")));
        resp.setContentType("text/json;charset=UTF-8");
            resp.getWriter().write("{\"message\":\"删除成功\"}");
}



    public void all(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<AdminUser> typeList = yonghuService.getAll();
        List<ZtreeDate> ztree = new ArrayList<ZtreeDate>();
        SerializeConfig config = new SerializeConfig();
        for(AdminUser j:typeList){
            ZtreeDate z = new ZtreeDate(j.getUsername(),false,j.getId(),0,true);
            System.out.print(z);
            ztree.add(z);
        }
        resp.setContentType("text/json;charset=utf-8");
        String s = JSON.toJSONString(ztree);
        resp.getWriter().write(s);
    }
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminUser adminUser = new AdminUser();
        adminUser.setUsername(req.getParameter("username"));
        adminUser.setPassword(req.getParameter("password"));
        yonghuService.add(adminUser);

        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"添加成功\"}");
    }
}
