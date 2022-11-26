package com.tang.web.servlet;

import com.alibaba.fastjson.JSON;
import com.tang.pojo.Book;
import com.tang.pojo.PageBean;
import com.tang.service.impl.BookServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@WebServlet("/book/*")
public class BookServlet extends BaseServlet {

    private BookServiceImpl bookService =  new BookServiceImpl();

    /**
     * 查询所有
     * @param request
     * @param response
     * @throws IOException
     */
    public void selectAll(HttpServletRequest request,HttpServletResponse response) throws IOException {
        // 调用service查询
        List<Book> books = bookService.selectAll();
        // 转为json
        String jsonString = JSON.toJSONString(books);
        // 写数据
        // 设置编码格式
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    /**
     * 添加数据
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        // 接收数据
        BufferedReader reader = request.getReader();
        String line = reader.readLine();  // json字符串

        // 转为Brand对象
        Book book = JSON.parseObject(line, Book.class);

        // 调用service添加
        bookService.add(book);

        // 响应成功的标识
        response.getWriter().write("success");
    }

    /**
     * 根据id更新数据
     * @param request
     * @param response
     * @throws IOException
     */
    public void update(HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        // 接收数据
        BufferedReader reader = request.getReader();
        String line = reader.readLine();   // json字符串

        // 转为Book对象
        Book book = JSON.parseObject(line, Book.class);

        // 调用service添加
        bookService.update(book);
        // 响应成功标识
        response.getWriter().write("success");
    }

    /**
     * 根据id查找数据
     */
    public void selectById(HttpServletRequest request,HttpServletResponse response) throws IOException {
        // 获取id
        String id = request.getParameter("id");
        // 调用service查找数据
        Book book = bookService.selectById(id);
        // 转为json
        String jsonString = JSON.toJSONString(book);
        // 写数据
        // 设置编码格式
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    /**
     * 根据id删除数据
     * @param request
     * @param response
     * @throws IOException
     */
    public void deleteById(HttpServletRequest request,HttpServletResponse response) throws IOException {
        // 获取id
        BufferedReader reader = request.getReader();
        String line = reader.readLine();  // json字符串
        // 调用service删除数据
        bookService.deleteById(line);
        // 响应成功标识
        response.getWriter().write("success");
    }

    /**
     * 批量删除
     * @param request
     * @param response
     * @throws IOException
     */
    public void deleteByIds(HttpServletRequest request,HttpServletResponse response) throws IOException {
        // 获取ids
        BufferedReader reader = request.getReader();
        String line = reader.readLine();   // json字符串

        // 转为int[]
        int[] ids = JSON.parseObject(line,int[].class);
        // 调用service删除
        bookService.deleteByIds(ids);
        // 响应成功标识
        response.getWriter().write("success");
    }

    /**
     * 分页查询
     * @param request
     * @param response
     * @throws IOException
     */
    public void selectByPage(HttpServletRequest request,HttpServletResponse response) throws IOException {
        // 接收当前页码和每页展示条数
        String _currentPage = request.getParameter("currentPage");
        String _pageSize = request.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);

        // 调用service查询
        PageBean<Book> pageBean = bookService.selectByPage(currentPage, pageSize);
        // 转为json
        String jsonString = JSON.toJSONString(pageBean);
        // 写数据
        // 设置编码数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    /**
     * 分页条件查询
     * @param request
     * @param response
     * @throws IOException
     */
    public void selectByPageAndCondition(HttpServletRequest request,HttpServletResponse response) throws IOException {
        // 接收当前页码和每页展示条数
        String  _currentPage = request.getParameter("currentPage");
        String _pageSize = request.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);

        // 获取查询条件对象
        BufferedReader reader = request.getReader();
        String line = reader.readLine();   // json字符串

        // 转为Book
        Book book = JSON.parseObject(line, Book.class);

        // 调用service进行查询
        PageBean<Book> pageBean = bookService.selectByPageAndCondition(currentPage, pageSize, book);

        // 转为json格式
        String jsonString = JSON.toJSONString(pageBean);
        // 写数据
        // 设置编码格式
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(jsonString);
    }
}
