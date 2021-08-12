package com.su.mtools.mvc.dao;

import com.su.mtools.mvc.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户数据库访问接口
 */
@Mapper
public interface UserDao {
    public int count();

    public int insert(User user);

    public int delete(Long id);

    public int update(User user);

    public User selectOne(Long id);
}
