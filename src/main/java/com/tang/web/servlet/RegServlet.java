package com.tang.web.servlet;

import com.tang.pojo.User;
import com.tang.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Struct;

@WebServlet("/regServlet")
public class RegServlet extends HttpServlet {

    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 接收用户传递的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // 获取验证码
        String checkCode = request.getParameter("checkCode");

        // 获取程序生成的验证码
        HttpSession session = request.getSession();
        String checkCodeGen = (String) session.getAttribute("checkCodeGen");

        // 封装用户对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // 比对验证码，忽略大小写
        if (!checkCodeGen.equalsIgnoreCase(checkCode)){
            // 不允许注册
            request.setAttribute("register_msg","验证码错误");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
            return;
        }

        // 调用service注册
        boolean flag = userService.register(user);
        response.setContentType("text/html;charset=utf-8");
        if (flag){
            request.setAttribute("register_msg","注册成功，请登录");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else {
            request.setAttribute("register_msg","用户名已存在");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
