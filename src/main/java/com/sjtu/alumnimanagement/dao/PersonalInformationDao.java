package com.sjtu.alumnimanagement.dao;

import com.sjtu.alumnimanagement.entity.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInformationDao extends JpaRepository<PersonalInformation, Integer> {
    PersonalInformation findById(int id);
}
