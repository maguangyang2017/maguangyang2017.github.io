package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Gong;
import com.guangyang.bean.Id;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.GongService;
import com.guangyang.service.impl.GongServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/5.
 */
public class GongServlet extends HttpServlet{
//    GongService gongService = BeanFactory.getInstance("gongService",GongService.class);
    GongService gongService  = new GongServiceImpl();
    int page = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String method = req.getParameter("m");
        if ("add".equals(method)) {
            addGong(req, resp);
        } else if ("index".equals(method)){
            index(req, resp);
        }else if ("getbyid".equals(method)){
            geteId(req, resp);
        }else if ("getAllInfo".equals(method)){
            getAllInfo(req,resp);
        }else{
            test(req,resp);
        }



    }
    public void test(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("ssss");
    }

    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Gong> newList = gongService.getAll();
//        System.out.println("1");
        req.setAttribute("gong", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/gongqiu/gong1.jsp").forward(req, resp);

    }
    public void addGong(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tijiao = req.getParameter("tijiao");
//        Gong gong = new Gong();
//        gong.getGtitle(req.getParameter("gtitle"));
        gongService.addGong(tijiao);
//        System.out.println(tijiao);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"添加成功\"}");
    }
    public void geteId(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Gong gong = gongService.getById(id);
        req.setAttribute("gong1",gong);
//        List<Gong> newList = gongService.getAll();
//        req.setAttribute("gong", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/gongqiu/gongneirong.jsp").forward(req,resp);

    }
    protected void getAllInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page2 = req.getParameter("page");
        //分页获取
        if(page2.equals("0")){
            page=1;
        }else if("j".equals(page2)){
            page-=1;
        }else if("z".equals(page2)){
            page+=1;
        }else{
            page=Integer.parseInt(page2);
        }

//        System.out.println("*******---page="+page);

        int count = gongService.getCount();//总条数
        int pageCount = (int)(Math.ceil(((double)count)/7));//页数
        //System.out.println("***页数:"+pageCount);
        List<Id> ib = new ArrayList<Id>();
        for(int i=1;i<=pageCount;i++){
            Id ia = new Id(i);
            ib.add(ia);
//            System.out.println(ia);
        }

        if(page<=0){
            page=1;
        }else if(page>pageCount){
            page=pageCount;
        }

        String id = req.getParameter("id");
        if(id!=null){
            req.setAttribute("you",1);
        }else{
            req.setAttribute("you",0);
        }
        List<Gong> list = gongService.getAllInfo(page);

        req.setAttribute("fenye",ib);
        req.setAttribute("list",list);
        this.getServletConfig().getServletContext().getRequestDispatcher("/gongqiu/gong1.jsp").forward(req,resp);
    }

}
