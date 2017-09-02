package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.SupDemBean;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.FabuService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/17.
 */
public class FabuServlet extends HttpServlet{
    FabuService fabuService = BeanFactory.getInstance("fabuService",FabuService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("m");
        if ("add".equals(method)) {
            add(req, resp);
        } else if ("select".equals(method)) {
            select(req, resp);
        }
    }
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SupDemBean supDemBean = new SupDemBean();
        supDemBean.setTitle(req.getParameter("title"));
        supDemBean.setDescription(req.getParameter("description"));
        supDemBean.setPrice(Integer.parseInt(req.getParameter("price")));
        supDemBean.setAddress(req.getParameter("address"));
        supDemBean.setContent(req.getParameter("content"));
        fabuService.add(supDemBean);

        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"添加成功\"}");

    }
    public void select(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=UTF-8");
        List<SupDemBean> newList = fabuService.getAll();

        req.setAttribute("fabu", newList);
        resp.getWriter().write(JSON.toJSONString(newList));

//        this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/supDem_manage.jsp").forward(req, resp);

    }
}
