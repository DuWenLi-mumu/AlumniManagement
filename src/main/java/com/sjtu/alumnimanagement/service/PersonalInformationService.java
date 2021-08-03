package com.sjtu.alumnimanagement.service;

import com.sjtu.alumnimanagement.dao.PersonalInformationDao;
import com.sjtu.alumnimanagement.entity.PersonalInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PersonalInformationService {
    @Autowired
    PersonalInformationDao personalInformationDao;

    public List<PersonalInformation> getAllPersonalInformation() {
        return personalInformationDao.findAll();
    }

    public PersonalInformation getPersonalInformationById(int id) {
        return personalInformationDao.findById(id);
    }
}
