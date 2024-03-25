package com.back.controller;

import com.back.common.BaseResponse;
import com.back.common.ResultUtils;
import com.back.model.entity.User;
import com.back.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public BaseResponse<User> login(@RequestBody User user, HttpServletRequest request){
        log.info("{} 进行登录",user);



        return ResultUtils.success(user);
    }

}
