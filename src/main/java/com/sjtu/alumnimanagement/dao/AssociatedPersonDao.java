package com.sjtu.alumnimanagement.dao;

import com.sjtu.alumnimanagement.entity.AssociatedPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociatedPersonDao extends JpaRepository<AssociatedPerson, Integer> {
    AssociatedPerson findById(int id);
}
