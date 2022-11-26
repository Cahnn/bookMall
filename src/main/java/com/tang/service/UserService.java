package com.tang.service;

import com.tang.mapper.UserMapper;
import com.tang.pojo.User;
import com.tang.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     *注册
     * @param user
     * @return
     */
    public boolean register(User user){
        // 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取UserMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 判断用户名是否存在
        User u = mapper.selectUser(user.getUsername());

        if (u == null){
            // 用户不存在，注册
            mapper.add(user);
            sqlSession.commit();// 提交事务
        }
        sqlSession.close();

        // 返回
        return u == null;
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public User login(String username,String password){
        // 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        // 获取UserMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 判断用户名是否存在
        User u = mapper.select(username,password);

        sqlSession.close();

        // 返回
        return u;
    }
}
