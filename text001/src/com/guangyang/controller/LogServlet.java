package com.guangyang.controller;

import com.alibaba.fastjson.JSON;
import com.guangyang.bean.Log;
import com.guangyang.bean.Message;
import com.guangyang.exception.AdminUserPasswordException;
import com.guangyang.exception.AdminUserUsernameException;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.impl.LogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;


/**
 * Created by 马光阳 on 2017/6/30.
 */
public class LogServlet extends HttpServlet{
    LogServiceImpl logService = BeanFactory.getInstance("logService",LogServiceImpl.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String image = req.getParameter("image");
        HttpSession httpSession = req.getSession(true);
        String sessioncole =  (String)httpSession.getAttribute("vcode");
        if(!sessioncole.equals(image)){
            System.out.println("验证码错误");
            return;
        }
        Cookie cookie = new Cookie("name","");
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
        String name = req.getParameter("name");
        System.out.print(name);
        String password = req.getParameter("password");
        Log log = new Log();
        log.setName(name);
        log.setPassword(password);
        Message message = new Message();
        message.status = 0;
        Log log1 = null;
        try {
            log1 = logService.loginCheck(log);
            if(log1.getStatus()==1){
                //表示封禁
                message.status = 3;
                message.message="用户已封禁";

            }
            if(log1.getStatus()==2){
                //申诉中
                message.status = 4;
                message.message = "用户申诉中";
            }
        } catch (AdminUserPasswordException e) {
            message.status = 2;
            message.message = e.getMessage();
            e.printStackTrace();
        } catch (AdminUserUsernameException e) {
            message.status = 1;
            message.message = e.getMessage();
            e.printStackTrace();
        }
        resp.setContentType("text/json;charset=UTF-8");
        String reb = JSON.toJSONString(message);
        resp.getWriter().write(reb);

        Cookie cookie = new Cookie("name",log.getName());
        cookie.setMaxAge(24*60*60);
        cookie.setPath("/");
        Cookie cookie2 = new Cookie("id",log.getId()+"");
        cookie2.setMaxAge(24*60*60);
        cookie2.setPath("/");
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
    }

}
