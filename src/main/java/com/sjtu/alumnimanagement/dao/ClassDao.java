package com.sjtu.alumnimanagement.dao;

import com.sjtu.alumnimanagement.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassDao extends JpaRepository<Class, Integer> {
    Class findById(int id);
}
