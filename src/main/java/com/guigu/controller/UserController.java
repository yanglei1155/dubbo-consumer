package com.guigu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guigu.pojo.User;
import com.guigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo//user")
public class UserController {
    @Reference
    private UserService userService;
   @RequestMapping("getUser")
    public User getUser(){
        return userService.getUser();
    }
}
