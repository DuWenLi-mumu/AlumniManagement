package com.sjtu.alumnimanagement.service;

import com.sjtu.alumnimanagement.dao.ImportantAlumniInformationDao;
import com.sjtu.alumnimanagement.entity.ImportantAlumniInformation;
import com.sjtu.alumnimanagement.entity.PersonalInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ImportantAlumniInformationService {
    @Autowired
    ImportantAlumniInformationDao importantAlumniInformationDao;
    public List<ImportantAlumniInformation> getAllImportantAlumniInformation() {
        return importantAlumniInformationDao.findAll();
    }

    public ImportantAlumniInformation getImportantAlumniInformationById(int id) {
        return importantAlumniInformationDao.findById(id);
    }

}
