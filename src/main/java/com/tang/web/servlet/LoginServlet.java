package com.tang.web.servlet;

import com.tang.pojo.User;
import com.tang.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private final UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 接收用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 获取复选框数据
        String remember = request.getParameter("remember");

        // 使用userService完成查询
        User user = userService.login(username, password);


        // 判断user是否为null
        response.setContentType("text/html;charset=utf-8");
        if (user != null){
            // 登陆成功
            // 判断用户是否勾选记住我
            if ("1".equals(remember)){
                // 创建cookie对象
                Cookie c_username = new Cookie("username", username);
                Cookie c_password = new Cookie("password", password);
                // 设置Cookie存活时间
                c_username.setMaxAge(60*60*24*7);
                c_password.setMaxAge(60*60*24*7);
                // 发送
                response.addCookie(c_username);
                response.addCookie(c_password);
            }
            // 将登录成功后的user对象存储到session
            HttpSession session = request.getSession();
            session.setAttribute("user",user);

            // 重定向到首页
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/backend/index.jsp");
        }else{
            // 登录失败

            // 将错误信息存储到request
            request.setAttribute("login_msg","用户名或密码错误");
            // 跳转到login.jsp
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
