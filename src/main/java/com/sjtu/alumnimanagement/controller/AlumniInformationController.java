package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.entity.AlumniInformation;
import com.sjtu.alumnimanagement.entity.UserInfo;
import com.sjtu.alumnimanagement.service.AlumniInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/alumni_information")
public class AlumniInformationController {
    @Autowired
    AlumniInformationService alumniInformationService;

    @CrossOrigin
    @GetMapping(path = "/getAll")
    public List<AlumniInformation> getAllUserInfo(){
        return alumniInformationService.getAllAlumniInformation();
    }

    @CrossOrigin
    @GetMapping(path = "/getById")
    public AlumniInformation getById(@RequestParam int id) {
        return alumniInformationService.getAlumniInformationById(id);
    }

}
