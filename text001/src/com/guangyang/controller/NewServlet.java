package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.New;
import com.guangyang.bean.Type;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.NewService;
import com.guangyang.service.TypeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/2.
 */
public class NewServlet extends HttpServlet{
    NewService newService = BeanFactory.getInstance("newService",NewService.class);

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
        } else if ("getnewbyid".equals(method)) {
            geteById(req,resp);
        } else if ("index".equals(method)) {
            index(req, resp);
        }else if ("getAll".equals(method)){
            getAll(req, resp);
        }else if ("getId".equals(method)){
            geteId(req, resp);
        }
//        }else {
//            index(req, resp);
//        }



    }
    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<New> newList = newService.getAll();
        System.out.println("1");
        req.setAttribute("news", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/news/news.jsp").forward(req, resp);

    }
    public void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<New> newList = newService.getAll();
        /*System.out.println("1");*/
        req.setAttribute("news", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/news/news2.jsp").forward(req, resp);

    }
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        New news = new New();
        news.setTitle(req.getParameter("title"));
        news.setContent(req.getParameter("content"));
        newService.addNew(news);

        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"添加成功\"}");
    }

    public void ajaxAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<New> newList = newService.getAll();
        String json = JSON.toJSONString(newList);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write(json);
    }

    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        newService.deleteNew(Integer.parseInt(req.getParameter("id")));
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"删除成功\"}");
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        System.out.println(id);
        System.out.println(title);
        System.out.println(content);


        New news = new New();
        news.setId(id);
        news.setTitle(title);
        news.setContent(content);

        newService.update(news);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"更新成功\"}");

    }

    public void geteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        New news = newService.getNewById(id);
        req.setAttribute("news1",news);
        List<New> newList = newService.getAll();
        req.setAttribute("news", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/types/update2.jsp").forward(req,resp);

    }
    public void geteId(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        New news = newService.getNewById(id);
        req.setAttribute("news1",news);
        List<New> newList = newService.getAll();
        req.setAttribute("news", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/news/zhanshi.jsp").forward(req,resp);

    }
}
