package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.entity.AssociatedPerson;
import com.sjtu.alumnimanagement.entity.FamilyRelation;
import com.sjtu.alumnimanagement.service.AssociatedPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/api/associated_person")
public class AssociatedPersonController {
    @Autowired
    AssociatedPersonService associatedPersonService;

    @CrossOrigin
    @GetMapping(path = "/getAll")
    public List<AssociatedPerson> getAllUserInfo(){
        return associatedPersonService.getAllAssociatedPerson();
    }

    @CrossOrigin
    @GetMapping(path = "/getById")
    public AssociatedPerson getById(@RequestParam int id) {
        return associatedPersonService.getAssociatedPersonById(id);
    }

}
