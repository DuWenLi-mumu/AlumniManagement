package com.sjtu.alumnimanagement.dao;

import com.sjtu.alumnimanagement.entity.Moments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MomentsDao extends JpaRepository<Moments, Integer> {
    Moments findById(int id);
}
