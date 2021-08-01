package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.entity.UserInfo;
import com.sjtu.alumnimanagement.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserInfoService userInfoService;


    @CrossOrigin
    @GetMapping(path = "/getAll")
    public List<UserInfo> getAllUserInfo(){
        return userInfoService.getAllUsers();
    }

    // localhost:8081/user/getById?id=xxxxx
    @CrossOrigin
    @GetMapping(path = "/getById")
    public UserInfo getById(@RequestParam int id) {
        return userInfoService.getUserById(id);
    }


    @CrossOrigin
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
