package com.team.loanuser.controller;

import com.team.loanuser.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/Hello")
    public String hello(){
        return userService.run();
    }
}
