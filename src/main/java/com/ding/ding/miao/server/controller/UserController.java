package com.ding.ding.miao.server.controller;

import com.ding.ding.miao.server.common.WeChatApi;
import com.ding.ding.miao.server.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/add")
    public Boolean addUser(String code) {
        System.out.println("hello " + code);

        return userService.addUser(code);
    }

}
