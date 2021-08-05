package com.sjtu.alumnimanagement.service;

import com.sjtu.alumnimanagement.dao.MomentsDao;
import com.sjtu.alumnimanagement.entity.Moments;
import com.sjtu.alumnimanagement.entity.PersonalInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class MomentsService {
    @Autowired
    MomentsDao momentsDao;

    public List<Moments> getAllMoments() {
        return momentsDao.findAll();
    }

    public Moments getMomentsById(int id) {
        return momentsDao.findById(id);
    }

}
