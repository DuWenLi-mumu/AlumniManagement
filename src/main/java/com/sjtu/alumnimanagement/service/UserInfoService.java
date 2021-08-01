package com.sjtu.alumnimanagement.service;

import com.sjtu.alumnimanagement.dao.UserInfoDao;
import com.sjtu.alumnimanagement.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserInfoService {
    @Autowired
    UserInfoDao userInfoDao;

    public List<UserInfo> getAllUsers() {
        return userInfoDao.findAll();
    }

    public UserInfo getUserById(int id) {
        return userInfoDao.findById(id);
    }
}
