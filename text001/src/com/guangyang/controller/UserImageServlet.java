package com.guangyang.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 马光阳 on 2017/7/3.
 */
public class UserImageServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String image = req.getParameter("image");
        HttpSession httpSession = req.getSession(true);
       String sessioncole =  (String)httpSession.getAttribute("vcode");
        if(sessioncole.equals(image)){

        }
    }
}
