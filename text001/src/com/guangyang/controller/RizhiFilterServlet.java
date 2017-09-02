package com.guangyang.controller;

import com.guangyang.bean.Rizhi;
import com.guangyang.dao.RizhiDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.RizhiService;
import com.guangyang.service.impl.RizhiServiceImpl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class RizhiFilterServlet implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        RizhiService rizhiService = BeanFactory.getInstance("rizhiService",RizhiService.class);
        RizhiDao rizhiDao = BeanFactory.getInstance("rizhiDao",RizhiDao.class);
        servletRequest.setCharacterEncoding("UTF-8");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        try {
            rizhiService = new RizhiServiceImpl();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Rizhi rizhi = new Rizhi();
        //获取ip地址
        String ip = request.getRemoteAddr();
        rizhi.setUip(ip);
        //获取url地址
        String url = request.getRequestURL().toString();
        rizhi.setUrl(url);
        //获取请求方式类型
        String method = request.getMethod();
        rizhi.setQtype(method);
        //获取method
        String m = request.getParameter("m");
        //请求参数
        String canshu = request.getQueryString();
        rizhi.setCanshu(canshu);
        //操作用户
        String user = "";
        rizhi.setUser(user);
        //操作
        String caozuo = "";
        String url2 = request.getRequestURI();
        if("/AdminUserServlet".equals(url2)){
            caozuo = "后台用户登陆";
        }else if("/NewServlet".equals(url2)){
            if("ajaxAll".equals(method)){
                caozuo = "新闻管理";
            }else if("add".equals(method)){
                caozuo = "添加新闻";
            }else if("update".equals(method)){
                caozuo = "修改新闻";
            }else if("delete".equals(method)){
                caozuo = "删除新闻";
            }
        }else if("/TypeServlet".equals(url2)){
            if("ajax_all".equals(method)){
                caozuo = "类型管理";
            }else if("add".equals(method)){
                caozuo = "新增类型";
            }else if("update".equals(method)){
                caozuo = "修改类型";
            }else if("delete".equals(method)){
                caozuo = "删除类型";
            }
        }else if("/JueServlet".equals(url2)){
            if("ajaxjue".equals(method)){
                caozuo = "角色管理";
            }else if("addjue".equals(method)){
                caozuo = "添加角色";
            }else if("updatejue".equals(method)){
                caozuo = "修改角色";
            }else if("deletejue".equals(method)){
                caozuo = "删除角色";
            }
        }else if("/QuanServlet".equals(url2)){
            if("ajaxquan".equals(method)){
                caozuo = "权限管理";
            }else if("addquan".equals(method)){
                caozuo = "添加权限";
            }else if("updatequan".equals(method)){
                caozuo = "修改权限";
            }else if("deletequan".equals(method)){
                caozuo = "删除权限";
            }
        }else if("/YongServlet".equals(url2)){
            if("ajax".equals(method)){
                caozuo = "前台用户管理";
            }else if("add".equals(method)){
                caozuo = "添加前台用户";
            }else if("update".equals(method)){
                caozuo = "修改前台用户";
            }else if("delete".equals(method)){
                caozuo = "删除前台用户";
            }
        }else if("/AdminYongServlet".equals(url2)){
            if("ajaxuser".equals(method)){
                caozuo = "后台用户管理";
            }else if("adduser".equals(method)){
                caozuo = "添加后台用户";
            }else if("updateuser".equals(method)){
                caozuo = "修改后台用户";
            }else if("deleteuser".equals(method)){
                caozuo = "删除后台用户";
            }
        }
        rizhi.setCaozuo(caozuo);
        //
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = new Date();
        String date = sdf.format(d);
        rizhi.setCtime(date);
        //用户标识
        String biaoshi = request.getHeader("user-agent");
        rizhi.setBiaoshi(biaoshi);
        rizhiService.add(rizhi);
        System.out.println(rizhi);
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
