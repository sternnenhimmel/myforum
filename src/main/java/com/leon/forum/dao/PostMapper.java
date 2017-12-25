package com.leon.forum.dao;

import com.leon.forum.model.Post;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface PostMapper {
    int deleteByPrimaryKey(Integer postid);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer postid);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}