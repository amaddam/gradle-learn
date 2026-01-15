package com.self.user.controller;

import com.self.result.R;
import com.self.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/info/{id}")
    public R getUserInfo(@PathVariable Integer id){
        Map<String, Object> userInfo = userService.getUserInfo(id);
        return R.ok().data(userInfo);
    }
}
