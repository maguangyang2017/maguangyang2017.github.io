package com.guangyang.controller;

import com.guangyang.bean.New;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.NewService;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListNewsServlet extends HttpServlet {
    NewService newService = BeanFactory.getInstance("newsService",NewService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        List<New> list = newService.getAll();
        req.setAttribute("newsAll",list);
        this.getServletConfig().getServletContext().getRequestDispatcher("/news/list_news.jsp").forward(req,resp);
    }
}
