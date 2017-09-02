package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.guangyang.bean.Juese;
import com.guangyang.bean.New;
import com.guangyang.bean.Permission;
import com.guangyang.bean.Quanxian;
import com.guangyang.dto.ZtreeDate;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.NewService;
import com.guangyang.service.QuanxianService;

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
public class QuanxianServlet extends HttpServlet{
    QuanxianService quanxianService = BeanFactory.getInstance("quanxianService",QuanxianService.class);

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
            getById(req,resp);
        } else if ("index".equals(method)) {
            index(req, resp);
        } else if ("getAll".equals(method)) {
            getAll(req, resp);
        }
//        }else {
//            index(req, resp);
//        }



    }
    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Permission> newList = quanxianService.getAll();
        System.out.println("1");
        req.setAttribute("quanxian", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);

    }
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Permission permission = new Permission();
        permission.setName(req.getParameter("name"));
        permission.setUrl(req.getParameter("url"));
        permission.setType(Integer.getInteger("type"));
        permission.setPId(Integer.getInteger("pId"));
        quanxianService.add(permission);

        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"添加成功\"}");
    }

    public void ajaxAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Permission> newList = quanxianService.getAll();
        String json = JSON.toJSONString(newList);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write(json);
    }

    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        quanxianService.delete(Integer.parseInt(req.getParameter("id")));
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"删除成功\"}");
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String urll = req.getParameter("urll");



        Permission permission = new Permission();
        permission.setId(id);
        permission.setName(name);
        permission.setUrl(urll);

        quanxianService.update(permission);
        resp.setContentType("text/json;charset=UTF-8");
        resp.getWriter().write("{\"message\":\"更新成功\"}");

    }

    public void getById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Permission permission = quanxianService.getById(id);
        req.setAttribute("quanxian1",permission);
        List<Permission> newList = quanxianService.getAll();
        req.setAttribute("quanxina", newList);
        this.getServletConfig().getServletContext().getRequestDispatcher("/quanxian/update.jsp").forward(req,resp);

    }
    protected void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String m = req.getParameter("m");
        List<Permission> permissions = quanxianService.getAll();
//        System.out.println(JSON.toJSONString(permissions));
        List<ZtreeDate> ztree = new ArrayList<ZtreeDate>();
        SerializeConfig config = new SerializeConfig();
        for(Permission p:permissions){
            ZtreeDate z = new ZtreeDate(p.getName(),false,p.getId(),p.getPId(),true);
            ztree.add(z);
            System.out.print("zzzzzzzzzz"+z);
        }
        resp.setContentType("text/json;charset=utf-8");
        String s = JSON.toJSONString(ztree);
        System.out.println("ssssssssssss"+s+"zzzzzzz"+ztree);
        resp.getWriter().write(s);
    }


}
