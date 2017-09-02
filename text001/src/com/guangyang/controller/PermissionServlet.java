package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.guangyang.bean.Permission;
import com.guangyang.dto.ZtreeDate;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.PermissionService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/10.
 */
public class PermissionServlet extends HttpServlet{
    PermissionService permissionService = BeanFactory.getInstance("permissionService",PermissionService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String m = req.getParameter("m");
        List<Permission> permissions = permissionService.getAll();
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
