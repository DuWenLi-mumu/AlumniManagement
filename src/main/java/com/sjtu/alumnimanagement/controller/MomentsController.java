package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.entity.Moments;
import com.sjtu.alumnimanagement.entity.PersonalInformation;
import com.sjtu.alumnimanagement.service.MomentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/moments")
public class MomentsController {
    @Autowired
    MomentsService momentsService;

    @CrossOrigin
    @GetMapping(path = "/getAll")
    public List<Moments> getAllUserInfo(){
        return momentsService.getAllMoments();
    }

    @CrossOrigin
    @GetMapping(path = "/getById")
    public Moments getById(@RequestParam int id) {
        return momentsService.getMomentsById(id);
    }


}
