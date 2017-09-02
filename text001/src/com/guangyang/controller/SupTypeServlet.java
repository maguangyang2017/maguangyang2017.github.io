package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Type;
import com.guangyang.service.TypeService;
import com.guangyang.service.impl.TypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SupTypeServlet extends HttpServlet {
    TypeService iTypeService = new TypeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        List<Type> list = iTypeService.getAll();
        req.setAttribute("supply",list);
        this.getServletConfig().getServletContext().getRequestDispatcher("/types/supply_type.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json; charset=UTF-8");
        int pid = Integer.parseInt(req.getParameter("pid"));
        List<Type> list = iTypeService.getAll();
        String json = JSON.toJSONString(list);
        resp.getWriter().write(json);
    }
}
