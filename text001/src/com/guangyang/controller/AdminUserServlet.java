package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.AdminUser;
import com.guangyang.bean.Message;
import com.guangyang.exception.AdminUserPasswordException;
import com.guangyang.exception.AdminUserUsernameException;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.AdminUserService;
import com.guangyang.service.impl.AdminUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class AdminUserServlet extends HttpServlet{
     AdminUserService adminUserService = BeanFactory.getInstance("adminUserService",AdminUserService.class);
//     AdminUserService iAdminUserService = new AdminUserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("username","");
        cookie.setMaxAge(0);
        cookie.setPath("/");
        Cookie cookie2 = new Cookie("id","");
        cookie2.setMaxAge(0);
        cookie2.setPath("/");
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
        resp.getWriter().write("退出了");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        AdminUser adminUser = new AdminUser();
        adminUser.setUsername(username);
        adminUser.setPassword(password);
        Message message = new Message();
        message.status = 0;
        try {
            adminUser = adminUserService.loginCheck(adminUser);
        } catch (AdminUserPasswordException e) {
            message.status = 2;
            message.message = e.getMessage();
            e.printStackTrace();
        } catch (AdminUserUsernameException e) {
            message.status = 1;
            message.message = e.getMessage();
            e.printStackTrace();
        }
        if(adminUser.getStatus()==1){
            //表示封禁
            message.status = 3;
            message.message="用户已封禁";

        }
        if(adminUser.getStatus()==2){
            //申诉中
            message.status = 4;
            message.message = "用户申诉中请等待";
        }
        Cookie cookie = new Cookie("username",adminUser.getUsername());
        cookie.setMaxAge(24*60*60);
        cookie.setPath("/");
        Cookie cookie2 = new Cookie("id",adminUser.getId()+"");
        cookie2.setMaxAge(24*60*60);
        cookie2.setPath("/");
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
        resp.setContentType("text/json;charset=UTF-8");
        String reb = JSON.toJSONString(message);
        resp.getWriter().write(reb);
    }

}
