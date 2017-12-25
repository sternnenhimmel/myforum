package com.leon.forum.web;

import com.leon.forum.model.Users;
import com.leon.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Liol on 25/12/2017.
 */

@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    public Users findUserById(@PathVariable("id") Integer id){
        return userService.findUserById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = "application/json")
    public String insertUser(@RequestBody Users user, HttpServletRequest request){
        return "Successfully created: " + request.getRequestURL() + "/" + userService.CreateUser(user);
    }

    @RequestMapping(value = "/user/hello", method = RequestMethod.GET, produces = "application/json")
    public String findUserById(){
            return "Hello";
    }
}
