package com.guangyang.filter;

import com.guangyang.bean.Rizhi;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public class Textfilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

//        //用户标识
//        String biaoshi = req.getHeader("user-agent");
//        //用户IP
//        String ip = req.getRemoteAddr();
////        String url = request.getRequestURI().toString();
//        int id =0;
//        String user = "";
//        Cookie[] cookies = req.getCookies();
//        for(Cookie c :cookies ){
//            //用户名
//            if (c.getName().equals("uname")){
//                user = c.getValue();
//            }
//            if(c.getName().equals("id")){
//                //用户id
//                id = Integer.parseInt(c.getValue());
//            }
//        }
//        //路径
//        String panduan = req.getRequestURI().toString();
//        //请求类型
//        String qtype = req.getMethod();
//        //请求时间
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date d = new Date();
//        String date = sdf.format(d);
//        Rizhi rizhi = new Rizhi(caozuo,user,date,panduan,qtype,ip,biaoshi);
//        iGuolvService.addRizhi(rizhi);



    }

    @Override
    public void destroy() {

    }
}
