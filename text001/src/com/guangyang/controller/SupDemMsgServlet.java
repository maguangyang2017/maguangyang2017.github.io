package com.guangyang.controller;


import com.guangyang.bean.SupDemBean;
import com.guangyang.bean.User;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.Service;
import com.guangyang.service.impl.SupDemMsgServiceImpl;
import com.guangyang.service.impl.UserMessageServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SupDemMsgServlet extends HttpServlet {
    Service<SupDemBean> serviceSupDem = BeanFactory.getInstance("supDemService", Service.class);
    Service<User> userMsg = BeanFactory.getInstance("userMessageServiceImpl", UserMessageServiceImpl.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String m = req.getParameter("m");
        if("usupAll".equals(m)){//个人用户所有供应信息
            uSupplyAll(req,resp);
        }else if("udemAll".equals(m)){//个人用户所有求购信息
            uDemandAll(req,resp);
        }else if("supAll".equals(m)){//全部供应信息
            supplyAll(req,resp);
        }else if("demAll".equals(m)){//全部求购信息
            demandAll(req,resp);
        }else if ("add".equals(m)){//添加供求信息
            add(req,resp);
        }else if("cPage".equals(m)){//内容页
            contentPage(req,resp);
        }else if("ucPage".equals(m)){//内容页
            contentPage(req,resp);
        }else if("b2b".equals(m)){
            b2b(req,resp);
        }else if("delete".equals(m)){
            delete(req,resp);
        }
    }

    protected void b2b(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer sdType = Integer.parseInt(req.getParameter("sdType"));
        String fTypeId = req.getParameter("fid");
        String zTypeId = req.getParameter("zid");
        String where = "where ";
        if(fTypeId==null||fTypeId.equals("")){
            where += "sd_type="+sdType;
        }else if(zTypeId==null||zTypeId.equals("")){
            where += "sd_type="+sdType+" and fTypeId="+fTypeId;
        }else{
            where += "sd_type="+sdType+" and fTypeId="+fTypeId+" and zTypeId="+zTypeId;
        }
        System.out.println(where);
        SupDemMsgServiceImpl supDemMsgService = (SupDemMsgServiceImpl)serviceSupDem;
        List<SupDemBean> list = supDemMsgService.getByCondition(where);
        req.setAttribute("list",list);
        req.setAttribute("t",sdType);
        if(req.getParameter("u")!=null){
            this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/uList_supDem.jsp").forward(req,resp);
        }else{
            this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/list_supDem.jsp").forward(req,resp);
        }

    }

    //个人用户所有供应信息
    protected void uSupplyAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        Cookie[] cookies = req.getCookies();
        Map<String,Cookie> mapC = new HashMap<String,Cookie>();
        if(cookies==null){
            resp.getWriter().write("<h2>未登录无法获得数据,请点击<a href=\"/zqwlogin.jsp\"  target=\"_blank\">登录</a></h2>");
            return;
        }else{
            for(Cookie c:cookies){
                mapC.put(c.getName(),c);
            }
            Cookie c = mapC.get("userid2");
            if(c==null){
                resp.getWriter().write("<h2>未登录无法获得数据,请点击<a href=\"/zqwlogin.jsp\"  target=\"_blank\">登录</a></h2>");
                return;
            }else if(Integer.parseInt(c.getValue())==0){
                resp.getWriter().write("<h2>未登录无法获得数据,请点击<a href=\"/zqwlogin.jsp\"  target=\"_blank\">登录</a></h2>");
                return;
            }
        }
        List<SupDemBean> list = serviceSupDem.findByCondition("1 and uid="+mapC.get("userid2").getValue());
        req.setAttribute("list",list);
        req.setAttribute("t","1");
        this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/uList_supDem.jsp").forward(req,resp);
    }
    //个人用户所有求购信息
    protected void uDemandAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        Cookie[] cookies = req.getCookies();
        Map<String,Cookie> mapC = new HashMap<String,Cookie>();
        if(cookies==null){
            resp.getWriter().write("<h2>未登录无法获得数据,请点击<a href=\"/zqwlogin.jsp\"  target=\"_blank\">登录</a></h2>");
            return;
        }else{
            for(Cookie c:cookies){
                mapC.put(c.getName(),c);
            }
            Cookie c = mapC.get("userid2");
            if(c==null){
                resp.getWriter().write("<h2>未登录无法获得数据,请点击<a href=\"/zqwlogin.jsp\"  target=\"_blank\">登录</a></h2>");
                return;
            }else if(Integer.parseInt(c.getValue())==0){
                resp.getWriter().write("<h2>未登录无法获得数据,请点击<a href=\"/zqwlogin.jsp\"  target=\"_blank\">登录</a></h2>");
                return;
            }
        }
        List<SupDemBean> list = serviceSupDem.findByCondition("0 and uid="+mapC.get("userid2").getValue());
        req.setAttribute("list",list);
        req.setAttribute("t","0");
        this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/uList_supDem.jsp").forward(req,resp);
    }

    //所有求购信息
    protected void demandAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<SupDemBean> list = serviceSupDem.findByCondition("0");
        req.setAttribute("list",list);
        req.setAttribute("t","-1");
        this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/list_supDem.jsp").forward(req,resp);
    }
    //所有求购信息
    protected void supplyAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<SupDemBean> list = serviceSupDem.findByCondition("1");
        req.setAttribute("list",list);
        req.setAttribute("t","-1");
        this.getServletConfig().getServletContext().getRequestDispatcher("/b2b/list_supDem.jsp").forward(req,resp);
    }

    //添加供求
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map map = req.getParameterMap();
        SupDemBean supDemBean = new SupDemBean();
        try {
            BeanUtils.populate(supDemBean,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        try {
            String[] strs1 = supDemBean.getContent().split("<img src=\"");
            String[] strs2 = strs1[1].split("\"");
            supDemBean.setTitleImgUrl(strs2[0]);
        }catch (Exception e){
            supDemBean.setTitleImgUrl("");
        }

        System.out.println(supDemBean);
        Cookie[] cookies = req.getCookies();
        Map<String,Cookie> mapC = new HashMap<String,Cookie>();
        for(Cookie c:cookies){
            mapC.put(c.getName(),c);
        }
        int userId = Integer.parseInt(mapC.get("userid2").getValue());
        supDemBean.setUid(userId);
        serviceSupDem.save(supDemBean);
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().write("发布成功！");
    }

    //供求内容页
    protected void contentPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        SupDemBean supDemBean = serviceSupDem.findById(Integer.parseInt(id));
        User user = userMsg.findById(supDemBean.getUid());
        supDemBean.setUser(user);
        req.setAttribute("msg",supDemBean);
//        String content = supDemBean.getContent();
//        String[] str = content.split("\n");
//        String sc = "";
//        for(String s:str){
//            sc+="<p>"+s+"</p>";
//        }
//        supDemBean.setContent(sc);
        if(req.getParameter("m").equals("cPage")){
            this.getServletConfig().getServletContext().getRequestDispatcher("/webFronts/supDem_content.jsp").forward(req,resp);
        }else if(req.getParameter("m").equals("ucPage")){
            this.getServletConfig().getServletContext().getRequestDispatcher("/webFronts/uSD_content.jsp").forward(req,resp);
        }

    }
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //
//        serviceSupDem.delete(Integer.parseInt(req.getParameter("id")));
//        resp.setContentType("text/json;charset=UTF-8");
//        resp.getWriter().write("{\"message\":\"删除成功\"}");
    }
}
