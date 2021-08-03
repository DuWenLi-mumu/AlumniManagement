package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.entity.PersonalInformation;
import com.sjtu.alumnimanagement.entity.UserInfo;
import com.sjtu.alumnimanagement.service.PersonalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/personal_information")
public class PersonalInformationController {
    @Autowired
    PersonalInformationService personalInformationService;

    @CrossOrigin
    @GetMapping(path = "/getAll")
    public List<PersonalInformation> getAllUserInfo(){
        return personalInformationService.getAllPersonalInformation();
    }

    @CrossOrigin
    @GetMapping(path = "/getById")
    public PersonalInformation getById(@RequestParam int id) {
        return personalInformationService.getPersonalInformationById(id);
    }
}
