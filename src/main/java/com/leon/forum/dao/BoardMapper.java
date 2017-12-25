package com.leon.forum.dao;

import com.leon.forum.model.Board;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface BoardMapper {
    int deleteByPrimaryKey(Integer boardid);

    int insert(Board record);

    int insertSelective(Board record);

    Board selectByPrimaryKey(Integer boardid);

    int updateByPrimaryKeySelective(Board record);

    int updateByPrimaryKey(Board record);
}