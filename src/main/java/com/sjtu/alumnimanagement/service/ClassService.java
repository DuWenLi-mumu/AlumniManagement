package com.sjtu.alumnimanagement.service;

import com.sjtu.alumnimanagement.dao.ClassDao;
import com.sjtu.alumnimanagement.entity.Class;
import com.sjtu.alumnimanagement.entity.FamilyRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class ClassService {
    @Autowired
    ClassDao classDao;

    public List<Class> getAllClass() {
        return classDao.findAll();
    }

    public Class getClassById(int id) {
        return classDao.findById(id);
    }

}
