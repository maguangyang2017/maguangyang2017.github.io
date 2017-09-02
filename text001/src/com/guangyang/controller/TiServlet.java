package com.guangyang.controller;



import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Ti;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.ITiService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Lenovo on 2017/7/2.
 */
public class TiServlet extends HttpServlet {
    ITiService iTiService = BeanFactory.getInstance("tiService",ITiService.class);

    public TiServlet() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String shangwu = req.getParameter("shangwu");
        String anquan = req.getParameter("anquan");
        String shouji = req.getParameter("shouji");
        iTiService.addTi(name,password,shangwu,anquan,shouji);
        req.setAttribute("message","注册成功");
        this.getServletConfig().getServletContext().getRequestDispatcher("/index.html").forward(req,resp);

    }

}
