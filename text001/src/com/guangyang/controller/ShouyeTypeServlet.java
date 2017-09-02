package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Type;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.ShouyeTypeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/16.
 */
public class ShouyeTypeServlet extends HttpServlet {
    ShouyeTypeService shouyeTypeService = BeanFactory.getInstance("shouyeTypeService",ShouyeTypeService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String m = req.getParameter("m");
        if("fuji".equals(m)){
            fuji(req,resp);
        }else if("ziji".equals(m)){
            ziji(req,resp);
        }
    }

    //父级
    protected void fuji(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Type> zhiShouYeBeen = shouyeTypeService.getParents(0);
//        System.out.print(JSON.toJSONString(zhiShouYeBeen));
        req.setAttribute("type",zhiShouYeBeen);
        //转发
        this.getServletConfig().getServletContext().getRequestDispatcher("/types/supply_type.jsp").forward(req,resp);
    }

    //子级
    protected void ziji(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pid = Integer.parseInt(req.getParameter("pid"));
//        System.out.println(pid);
        List<Type> list = shouyeTypeService.getById(pid);
//        System.out.println(list.toString());
        resp.setContentType("text/json; charset=UTF-8");
        String json = JSON.toJSONString(list);
        resp.getWriter().write(json);
    }

}

