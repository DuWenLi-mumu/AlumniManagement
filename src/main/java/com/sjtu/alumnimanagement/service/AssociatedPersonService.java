package com.sjtu.alumnimanagement.service;

import com.sjtu.alumnimanagement.dao.AssociatedPersonDao;
import com.sjtu.alumnimanagement.entity.AssociatedPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AssociatedPersonService {
    @Autowired
    AssociatedPersonDao associatedPersonDao;
    public List<AssociatedPerson> getAllAssociatedPerson() {
        return associatedPersonDao.findAll();
    }

    public AssociatedPerson getAssociatedPersonById(int id) {
        return associatedPersonDao.findById(id);
    }

}
