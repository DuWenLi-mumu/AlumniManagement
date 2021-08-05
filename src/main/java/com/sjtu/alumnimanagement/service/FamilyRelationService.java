package com.sjtu.alumnimanagement.service;

import com.sjtu.alumnimanagement.dao.FamilyRelationDao;
import com.sjtu.alumnimanagement.entity.FamilyRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class FamilyRelationService {
    @Autowired
    FamilyRelationDao familyRelationDao;

    public List<FamilyRelation> getAllFamilyRelation() {
        return familyRelationDao.findAll();
    }

    public FamilyRelation getFamilyRelationById(int id) {
        return familyRelationDao.findById(id);
    }
}
