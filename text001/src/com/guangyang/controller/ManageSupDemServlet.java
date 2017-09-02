package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.SupDemBean;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.Service;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

public class ManageSupDemServlet extends HttpServlet {
    Service<SupDemBean> serviceSupDem = BeanFactory.getInstance("supDemService", Service.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String m = req.getParameter("m");
        if("all".equals(m)){
            getAll(req,resp);
        }else if("delete".equals(m)){
            delete(req,resp);
        }else if("update".equals(m)){
            update(req,resp);
        }else if("updateSave".equals(m)){
            updateSave(req,resp);
        }
    }

    protected void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json; charset=utf-8");
        List<SupDemBean> list = serviceSupDem.findAll();
        String json = JSON.toJSONString(list);
        resp.getWriter().write(json);
    }
    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        int id = Integer.parseInt(req.getParameter("id"));
        serviceSupDem.deleteById(id);
        resp.getWriter().write("删除成功！");
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        int id = Integer.parseInt(req.getParameter("id"));
        SupDemBean supDemBean = serviceSupDem.findById(id);
        req.setAttribute("supDem",supDemBean);
        this.getServletConfig().getServletContext().getRequestDispatcher("/webFronts/b2b.jsp").forward(req,resp);
    }

    protected void updateSave(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Map map = req.getParameterMap();
        SupDemBean supDemBean = new SupDemBean();
        try {
            BeanUtils.populate(supDemBean,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        serviceSupDem.update(supDemBean);
        resp.getWriter().write("修改成功！");
    }
}
