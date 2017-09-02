package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Message;
import com.guangyang.bean.User;
import com.guangyang.exception.AdminUserPasswordException;
import com.guangyang.exception.AdminUserUsernameException;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static jdk.nashorn.internal.objects.Global.exit;

/**
 * Created by 马光阳 on 2017/7/2.
 */
public class UserServlet extends HttpServlet{
   UserService userService = BeanFactory.getInstance("userService",UserService.class);
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie cookie = new Cookie("uname","");
//        cookie.setMaxAge(0);
//        cookie.setPath("/");
//        Cookie cookie2 = new Cookie("id","");
//        cookie2.setMaxAge(0);
//        cookie2.setPath("/");
//        resp.addCookie(cookie);
//        resp.addCookie(cookie2);
//        resp.getWriter().write("退出了");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("m");
        if ("login".equals(method)){
            login(req,resp);
        }else if ("exits".equals(method)){
            exits(req,resp);
        }
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String username = req.getParameter("uname");
        String password = req.getParameter("upassword");
        User user = new User();
        user.setUname(username);
        user.setUpassword(password);
        Message message = new Message();
        message.status = 0;
        try {
            user = userService.loginCheck(user);
        } catch (AdminUserPasswordException e) {
            message.status = 2;
            message.message = e.getMessage();
            e.printStackTrace();
        } catch (AdminUserUsernameException e) {
            message.status = 1;
            message.message = e.getMessage();
            e.printStackTrace();
        }
        if(user.getStatus()==1){
            //表示封禁
            message.status = 3;
            message.message="用户已封禁";

        }
        if(user.getStatus()==2){
            //申诉中
            message.status = 4;
            message.message = "用户申诉中请等待";
        }
        Cookie cookie = new Cookie("uname",user.getUname());
        cookie.setMaxAge(24*60*60);
        cookie.setPath("/");
        Cookie cookie2 = new Cookie("id",user.getId()+"");
        cookie2.setMaxAge(24*60*60);
        cookie2.setPath("/");
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
        resp.setContentType("text/json;charset=UTF-8");
        String reb = JSON.toJSONString(message);
        resp.getWriter().write(reb);
    }
    private void exits(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Cookie cookie = new Cookie("uname","");
        cookie.setMaxAge(0);
        cookie.setPath("/");
        Cookie cookie2 = new Cookie("id","");
        cookie2.setMaxAge(0);
        cookie2.setPath("/");
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
        System.out.print("0000");

    }

}