package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Type;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.TypeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class TypeServlet extends HttpServlet{
    TypeService typeService = BeanFactory.getInstance("typeService",TypeService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("m");
        if ("add".equals(method)) {
            add(req, resp);
        } else if ("update".equals(method)) {
            update(req, resp);
        } else if ("ajax_all".equals(method)) {
            ajaxAll(req, resp);
        } else if ("delete".equals(method)) {
            delete(req, resp);
        } else if ("getbyid".equals(method)) {
            geteById(req,resp);
        } else {
            index(req, resp);
        }
    }
    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Type> typeList = typeService.getAll();
        req.setAttribute("types", typeList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/types/index.jsp").forward(req, resp);

    }
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Type type = new Type();
        type.setTitle(req.getParameter("title"));
        type.setDescription(req.getParameter("description"));
        type.setPid(Integer.parseInt(req.getParameter("pid")));
        typeService.addType(type);

        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"添加成功\"}");
    }

    public void ajaxAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Type> typeList = typeService.getAll();
        String json = JSON.toJSONString(typeList);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write(json);
    }

    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        typeService.deleteType(Integer.parseInt(req.getParameter("id")));
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"删除成功\"}");
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String title = req.getParameter("title");
        String desc = req.getParameter("description");
        int pid = Integer.parseInt(req.getParameter("pid"));
        Type type = new Type();
        type.setPid(pid);
        type.setId(id);
        type.setTitle(title);
        type.setDescription(desc);
        typeService.update(type);

        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"更新成功\"}");

    }

    public void geteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Type type = typeService.getTypeById(id);
        req.setAttribute("type",type);
        List<Type> typeList = typeService.getAll();
        req.setAttribute("types", typeList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/types/update.jsp").forward(req,resp);

    }
}
