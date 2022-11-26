package com.tang.mapper;

import com.tang.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    /**
     *添加用户
     * @param user
     */
    @Insert("insert into user values (null, #{username},#{password})")
    void add(User user);

    /**
     * 根据用户名查询用户对象
     * @param username
     * @return
     */
    @Select("select * from user where username = #{username}")
    User selectUser(String username);

    /**
     * 根据用户名和密码查询用户对象
     * @param username
     * @param password
     * @return
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    User select(@Param("username") String  username,@Param("password") String password);
}
