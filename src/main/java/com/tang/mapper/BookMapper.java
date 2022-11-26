package com.tang.mapper;

import com.tang.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookMapper {

    /**
     * 查询所有
     */
    List<Book> selectAll();

    /**
     * 新增
     * @param book
     */
    @Insert("insert into book values (null,#{title},#{author},#{intro},#{price},#{sold},#{inventory})")
    void add(Book book);

    /**
     * 根据id更新数据
     * @param book
     */
    @Update("update book set title = #{title},author = #{author},intro = #{intro},price = #{price},sold = #{sold},inventory = #{inventory} where id = #{id}")
    void update(Book book);

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    @Select("select * from book where id = #{id}")
    Book selectById(String id);

    /**
     * 根据id删除数据
     * @param id
     */
    @Delete("delete from book where id = #{id}")
    void deleteById(String id);

    /**
     * 批量删除
     * @param ids
     */
    void deleteByIds(@Param("ids") int[] ids);

    /**
     * 分页查询
     * @param begin
     * @param size
     * @return
     */
    @Select("select * from book limit #{begin},#{size}")
    List<Book> selectByPage(@Param("begin") int begin,@Param("size") int size);

    /**
     * 查询总记录数
     * @return
     */
    @Select("select count(*) from book;")
    int selectTotalCount();

    /**
     * 分页条将查询
     * @param begin
     * @param size
     * @param book
     * @return
     */
    List<Book> selectByPageAndCondition(@Param("begin")  int begin ,@Param("size") int size,@Param("book") Book book);

    /**
     * 查询条件总记录数
     * @param book
     * @return
     */
    int selectTotalCountByCondition(Book book);
}
