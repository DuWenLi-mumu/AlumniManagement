package com.sjtu.alumnimanagement.dao;

import com.sjtu.alumnimanagement.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoDao extends JpaRepository<UserInfo, Integer> {
    UserInfo findById(int id);
}
