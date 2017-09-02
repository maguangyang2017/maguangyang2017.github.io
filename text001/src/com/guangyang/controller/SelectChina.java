package com.guangyang.controller;

import com.guangyang.service.UserChinaService;
import com.guangyang.service.impl.UserChinaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

/**
 * Created by zh201 on 2017/6/22.
 */
public class SelectChina extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserChinaService userChinaService = new UserChinaServiceImpl();
        String id = req.getParameter("pid");
        Map<String,String> map = userChinaService.sCDao(id);
        Set<String> set = map.keySet();
        String c = "<option>请选择</option>";
        for(String s:set){
            String option = "<option value = \""+s+"\">"+map.get(s)+"</option>";
            c+=option;
        }
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out =resp.getWriter();
        out.write(c);
        out.flush();
        out.close();

    }
}
