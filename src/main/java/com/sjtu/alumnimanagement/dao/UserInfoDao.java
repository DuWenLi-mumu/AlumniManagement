package com.sjtu.alumnimanagement.dao;

import com.sjtu.alumnimanagement.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface UserInfoDao extends JpaRepository<UserInfo, Integer> {
    UserInfo findById(int id);
    List<UserInfo> findAll();
}
