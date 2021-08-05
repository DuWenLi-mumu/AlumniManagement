package com.sjtu.alumnimanagement.dao;

import com.sjtu.alumnimanagement.entity.FamilyRelation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRelationDao extends JpaRepository<FamilyRelation, Integer> {
    FamilyRelation findById(int id);
}
