package com.tang.service;

import com.tang.pojo.Book;
import com.tang.pojo.PageBean;

import java.util.List;

public interface BrandService {

    /**
     * 查询所有
     * @return
     */
    List<Book> selectAll();

    /**
     * 新增数据
     * @param book
     */
    void add(Book book);

    /**
     * 更新数据
     * @param book
     */
    void update(Book book);

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    Book selectById(String id);

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(String id);

    /**
     * 批量删除
     * @param ids
     */
    void deleteByIds(int[] ids);

    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    PageBean<Book> selectByPage(int currentPage, int pageSize);

    /**
     * 根据条件分页查询
     * @param currentPage
     * @param pageSize
     * @param book
     * @return
     */
    PageBean<Book> selectByPageAndCondition(int currentPage,int pageSize,Book book);

}
