package com.guangyang.controller;

import com.guangyang.factory.BeanFactory;
import com.guangyang.service.WenbenService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 马光阳 on 2017/7/11.
 */
public class WenbenServlet extends HttpServlet{
    WenbenService wenbenService = BeanFactory.getInstance("wenbenService",WenbenService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
