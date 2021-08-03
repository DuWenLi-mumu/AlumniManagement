package com.sjtu.alumnimanagement.service;

import com.sjtu.alumnimanagement.dao.AlumniInformationDao;
import com.sjtu.alumnimanagement.entity.AlumniInformation;
import com.sjtu.alumnimanagement.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AlumniInformationService {
    @Autowired
    AlumniInformationDao alumniInformationDao;
    public List<AlumniInformation> getAllAlumniInformation() {
        return alumniInformationDao.findAll();
    }
    public AlumniInformation getAlumniInformationById(int id) {
        return alumniInformationDao.findById(id);
    }
}
