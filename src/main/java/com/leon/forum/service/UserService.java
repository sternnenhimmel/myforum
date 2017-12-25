package com.leon.forum.service;

import com.leon.forum.dao.UsersMapper;
import com.leon.forum.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Liol on 25/12/2017.
 */
@Service
public class UserService {
    @Autowired
    private UsersMapper usersMapper;

    public Users findUserById(Integer id){
        return usersMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public Integer CreateUser(Users users){
        int result =  usersMapper.insert(users);

        if (result>0){
            return users.getUserid();
        }

        return null;
    }
}

