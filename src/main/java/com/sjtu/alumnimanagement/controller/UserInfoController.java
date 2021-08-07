package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.entity.UserInfo;
import com.sjtu.alumnimanagement.service.UserInfoService;
import com.sjtu.alumnimanagement.utils.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: sinkinben@outlook.com
 * Date: 2021/08/07
 */


@Controller
@RestController
@RequestMapping(path = "/api/user")
// 进入这个 controller 需要是 localhost:8081/api/user/xxxx 这样的 URL
// 如果 localhost 不行, 尝试 127.0.0.1:8081/api/user/xxxx
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

//    下面这些 API 会暴露密码, 因此去除, 后面考虑用 RSA 算法对密码加密 (现在就简单处理, 明文存储密码 =_=)
//    localhost:8081/api/user/getAll
//    @CrossOrigin
//    @GetMapping(path = "/getAll")
//    public List<UserInfo> getAllUserInfo() {
//        return userInfoService.getAllUsers();
//    }

//    localhost:8081/api/user/getById?id=xxxxx
//    @CrossOrigin
//    @GetMapping(path = "/getById")
//    public UserInfo getById(@RequestParam int id) {
//        return userInfoService.getUserById(id);
//    }


    @CrossOrigin
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @CrossOrigin
    @PostMapping(path = "login")
    @ResponseBody
    public ResultResponse login(@RequestBody UserInfo requestUser) {
        System.out.println(requestUser.getEmail());
        System.out.println(requestUser.getPasswd());
        return new ResultResponse(ResultResponse.SUCCESS);
    }
}
