package com.guangyang.controller;
import com.guangyang.bean.Qiu;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.QiuService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/6.
 */
public class QiuServlet extends HttpServlet {
    QiuService qiuService = BeanFactory.getInstance("qiuService",QiuService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("m");
        if ("add".equals(method)) {
            addGong(req, resp);
        } else if ("geteId".equals(method)){
            geteId(req, resp);
        }else if ("index".equals(method)){
            index(req, resp);
        }
    }

    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Qiu> newList = qiuService.getAll();
        System.out.println("1");
        req.setAttribute("qiu", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/gongqiu/qiu.jsp").forward(req, resp);

    }
    public void addGong(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Qiu qiu = new Qiu();
        qiu.getQtitle();
//        qiu.getQtitle(req.getParameter("qtitle"));
        qiuService.addGong(qiu);

        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"添加成功\"}");
    }
    public void geteId(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Qiu qiu = qiuService.getById(id);
        req.setAttribute("qiu1",qiu);
//        List<Gong> newList = gongService.getAll();
//        req.setAttribute("gong", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/gongqiu/qiuneirong.jsp").forward(req,resp);

    }
}
