package com.leon.forum.dao;

import com.leon.forum.model.LoginLog;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface LoginLogMapper {
    int deleteByPrimaryKey(Integer loginlogid);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selectByPrimaryKey(Integer loginlogid);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}