package com.guangyang.controller;

import com.guangyang.bean.Type;
import com.guangyang.service.TypeService;
import com.guangyang.service.impl.TypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SupDemEditPage extends HttpServlet {
    TypeService iTypeService = new TypeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String m = req.getParameter("m");
        resp.setContentType("text/html; charset=UTF-8");
        List<Type> list = iTypeService.getSupplyType(0);
        req.setAttribute("supply",list);
        if("uedit".equals(m)){
            this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/edit_supDem.jsp").forward(req,resp);
        }else if("edit".equals(m)){
//            System.out.println(JSON.toJSONString(list));
            this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/supDem_edit.jsp").forward(req,resp);
        }else if("indexDem".equals(m)){
            this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/index_dem.jsp").forward(req,resp);
        }else if("indexSup".equals(m)){
            String fTitle = req.getParameter("fTitle")+"";
            String zTitle = req.getParameter("zTitle")+"";
            String fid = req.getParameter("fid")+"";
            String zid = req.getParameter("zid")+"";
            req.setAttribute("fTitle",fTitle);
            req.setAttribute("zTitle",zTitle);
            req.setAttribute("fid",fid);
            req.setAttribute("zid",zid);
//            System.out.println(title+"---"+fid+"---"+zid);
            this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/index_sup.jsp").forward(req,resp);
        }else if("indexChanpin".equals(m)){
            this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/index_chanpin.jsp").forward(req,resp);
        }else if("indexGongsi".equals(m)){
            this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/index_gongsi.jsp").forward(req,resp);
        }
    }
}
