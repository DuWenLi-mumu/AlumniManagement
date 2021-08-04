package com.sjtu.alumnimanagement.dao;

import com.sjtu.alumnimanagement.entity.ImportantAlumniInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImportantAlumniInformationDao extends JpaRepository<ImportantAlumniInformation, Integer> {
    ImportantAlumniInformation findById(int id);
}
