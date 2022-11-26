package com.tang.service.impl;

import com.tang.mapper.BookMapper;
import com.tang.pojo.Book;
import com.tang.pojo.PageBean;
import com.tang.service.BrandService;
import com.tang.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BookServiceImpl implements BrandService {
    // 创建SqlSessionFactory工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Book> selectAll() {

        // 获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取BookMapper
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        // 调用方法
        List<Book> books = bookMapper.selectAll();

        // 释放资源
        sqlSession.close();

        return books;
    }

    public void add(Book book){
        // 获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取BookMapper
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        // 调用方法
        bookMapper.add(book);
        // 提交事务
        sqlSession.commit();

        // 释放资源
        sqlSession.close();
    }

    public void update(Book book){
        // 获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取BookMapper
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        // 调用方法
        bookMapper.update(book);
        // 提交事务
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }

    public Book selectById(String id){
        // 获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取BookMapper
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        Book book = bookMapper.selectById(id);

        sqlSession.close();
        return book;
    }

    /**
     * 根据id删除数据
     * @param id
     */
    public void deleteById(String id){
        // 获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取BookMapper
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        // 调用方法
        bookMapper.deleteById(id);
        // 提交事物
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 批量删除
     * @param ids
     */
    public void deleteByIds(int[] ids){
        // 获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取BookMapper
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        // 调用方法
        bookMapper.deleteByIds(ids);
        // 提交事物
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    public PageBean<Book> selectByPage(int currentPage,int pageSize){
        // 获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取BookMapper
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        // 计算开始索引
        int begin = (currentPage-1) * pageSize;
        // 计算查询条目
        int size = pageSize;

        // 调用方法
        List<Book> books = bookMapper.selectByPage(begin, size);
        // 查询总记录数
        int totalCount = bookMapper.selectTotalCount();
        // 封装PageBean对象
        PageBean<Book> pageBean = new PageBean<>();
        pageBean.setRows(books);
        pageBean.setTotalCount(totalCount);

        // 释放资源
        sqlSession.close();
        return pageBean;
    }

    public PageBean<Book> selectByPageAndCondition(int  currentPage,int pageSize,Book book){
        // 获取sqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 获取BookMapper
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);


        // 计算开始索引
        int begin = (currentPage-1) * pageSize;
        // 计算查询条目数
        int size = pageSize;

        // 处理book条件，模糊表达式
        String title = book.getTitle();
        if (title != null && title.length()>0){
            book.setTitle("%"+title+"%");
        }
        String author = book.getAuthor();
        if (author != null && author.length()>0){
            book.setAuthor("%"+author+"%");
        }

        // 调用方法
        List<Book> rows = bookMapper.selectByPageAndCondition(begin,size,book);
        // 查询总记录数
        int countByCondition = bookMapper.selectTotalCountByCondition(book);

        // 封装成PageBean对象
        PageBean<Book> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(countByCondition);

        // 释放资源
        sqlSession.close();
        return pageBean;
    }
}
