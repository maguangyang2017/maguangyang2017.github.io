package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.guangyang.bean.Juese;
import com.guangyang.bean.Permission;
import com.guangyang.bean.Quanxian;
import com.guangyang.dto.ZtreeDate;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.JueseService;

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
public class JueseServlet extends HttpServlet {
    JueseService jueseService = BeanFactory.getInstance("jueseService",JueseService.class);

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
            getById(req,resp);
        }else if ("userjue".equals(method)){
            userjue(req, resp);
        }else{
            index(req, resp);
        }
//        }else {
//            index(req, resp);
//        }



    }
    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Juese> newList = jueseService.getAll();
        System.out.println("1");
        req.setAttribute("news", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);

    }
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Juese news = new Juese();
        news.setName(req.getParameter("name"));
        jueseService.add(news);

        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"添加成功\"}");
    }

    public void ajaxAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Juese> newList = jueseService.getAll();
//        List<Permission> permissions = new ArrayList<Permission>();
//        for (Juese c:newList){
////            Permission z = new Quanxian();
//
//        }

        String json = JSON.toJSONString(newList);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write(json);
    }

    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        jueseService.delete(Integer.parseInt(req.getParameter("id")));
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"删除成功\"}");
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String title = req.getParameter("title");
        String content = req.getParameter("content");


        Juese juese = new Juese();
        juese.setId(id);
        juese.setName(title);

        jueseService.update(juese);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"更新成功\"}");

    }

    public void getById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Juese news = jueseService.getById(id);
        req.setAttribute("news1",news);
        List<Juese> newList = jueseService.getAll();
        req.setAttribute("news", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/types/update2.jsp").forward(req,resp);

    }
    private void userjue(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {
        int roleid = Integer.parseInt(req.getParameter("id"));
        /*System.out.println("********************"+roleid);*/
        String s = req.getParameter("nodes");
        String[] powerids = s.split(",");
        for(int i=0;i<powerids.length;i++){
            System.out.println("----****----"+powerids[i]);
        }
        jueseService.setPower(roleid,powerids);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"权限添加成功\"}");
    }



}
