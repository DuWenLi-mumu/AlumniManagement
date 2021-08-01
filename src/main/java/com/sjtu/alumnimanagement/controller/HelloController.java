package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.dao.UserInfoDao;
import com.sjtu.alumnimanagement.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
@RestController
public class HelloController {
    @Autowired
    private UserInfoDao userDao;

    @RequestMapping("/getAllUserInfo")
    public List<UserInfo> getAllUserInfo(){
       List<UserInfo> userInfoList = userDao.findAll();
        return userInfoList;
    }

}
