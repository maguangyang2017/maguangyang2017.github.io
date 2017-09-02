package com.guangyang.controller;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.UserChinaService;
import com.guangyang.service.impl.UserChinaServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by zh201 on 2017/6/22.
 */
public class UsersChinaServlet extends HttpServlet {
    UserChinaService userChinaService  = BeanFactory.getInstance("userChinaService",UserChinaService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserChinaService userChinaService = new UserChinaServiceImpl();
        List list = userChinaService.getPId();
        req.setAttribute("SF",list);
        this.getServletConfig().getServletContext().getRequestDispatcher("/zhuce.jsp").forward(req,resp);
    }
}
