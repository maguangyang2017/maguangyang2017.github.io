package com.guangyang.controller;

import com.guangyang.bean.SetQuan;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.SetQuanService;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class SerQuanFiltetServlet  implements Filter{
    SetQuanService setQuanService = BeanFactory.getInstance("setQuanService",SetQuanService.class);
    public SerQuanFiltetServlet() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
   }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //获取请求参数
        String url = request.getRequestURI();

        //获取当前管理员的id
        String id = "";
        Cookie[] cookies = request.getCookies();
        for(Cookie c:cookies){
            if(c.getName().equals("id")){
                id = c.getValue();
            }
        }
        List<SetQuan> list = setQuanService.getUrl(Integer.parseInt(id));
        boolean flag = false;
        if(list.size()>0){
            Iterator<SetQuan> it = list.iterator();
            while(it.hasNext()){
                SetQuan s = it.next();
                if(url.equals(s.getUrl())){
                    flag=true;
                }
            }
        }
        if(flag == true){
            filterChain.doFilter(request,response);
        }else {
            response.sendRedirect(request.getContextPath()+"/quanxian/jie.jsp");
        }
    }

    @Override
    public void destroy() {

    }
//
//
//    @Override
//
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//    }
//
//    @Override
//    public void destroy() {
//
//    }
}
