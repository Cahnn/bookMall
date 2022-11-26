package com.tang.web.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 替换HttpServlet，根据请求的最后一段路径来进行方法分发
 * */

public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求路径
        String uri = request.getRequestURI();  // /bookMall/book/selectAll
        // 获取最后一段路径、方法名
        int index = uri.lastIndexOf("/");
        String method = uri.substring(index+1);   // selectAll

        Class<? extends BaseServlet> aClass = this.getClass();

        // 获取方法method对象
        try{
            Method aClassMethod = aClass.getMethod(method, HttpServletRequest.class, HttpServletResponse.class);
            aClassMethod.invoke(this,request,response);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
