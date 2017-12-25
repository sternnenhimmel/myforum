package com.leon.forum.dao;

import com.leon.forum.model.Users;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UsersMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}