package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.entity.FamilyRelation;
import com.sjtu.alumnimanagement.entity.PersonalInformation;
import com.sjtu.alumnimanagement.service.FamilyRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/family_relation")
public class FamilyRelationController {
    @Autowired
    FamilyRelationService familyRelationService;

    @CrossOrigin
    @GetMapping(path = "/getAll")
    public List<FamilyRelation> getAllUserInfo(){
        return familyRelationService.getAllFamilyRelation();
    }

    @CrossOrigin
    @GetMapping(path = "/getById")
    public FamilyRelation getById(@RequestParam int id) {
        return familyRelationService.getFamilyRelationById(id);
    }

}
