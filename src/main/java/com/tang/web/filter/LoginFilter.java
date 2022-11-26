package com.tang.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        // 判断路径是否和登录注册相关
        String[] urls = {"/backend/login.jsp","/backend/imgs/","/backend/css/","/loginServlet","/backend/register.jsp","/regServlet","/checkCodeServlet"};
        // 强转类型
        HttpServletRequest req = (HttpServletRequest) request;
        // 获取当前访问资源
        String url = req.getRequestURL().toString();
        for (String u : urls){
            if (url.contains(u)){
                // 当前访问资源为允许访问资源，放行
                chain.doFilter(request, response);
                return;
            }
        }


        // 判断session中是否有user
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");

        if (user != null){
            // 已登录，放行
            chain.doFilter(request, response);
        }else {
            // 未登录，存储提示信息，跳转到登录页面
            req.setAttribute("login_msg","您尚未登录！");
            req.getRequestDispatcher("/backend/login.jsp").forward(req,response);
        }
//        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }


}
