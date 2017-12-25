package com.leon.forum.dao;

import com.leon.forum.model.Replies;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface RepliesMapper {
    int deleteByPrimaryKey(Integer replyid);

    int insert(Replies record);

    int insertSelective(Replies record);

    Replies selectByPrimaryKey(Integer replyid);

    int updateByPrimaryKeySelective(Replies record);

    int updateByPrimaryKey(Replies record);
}