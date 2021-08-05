package com.sjtu.alumnimanagement.dao;

import com.sjtu.alumnimanagement.entity.AlumniInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumniInformationDao extends JpaRepository<AlumniInformation, Integer> {
    AlumniInformation findById(int id);
}
