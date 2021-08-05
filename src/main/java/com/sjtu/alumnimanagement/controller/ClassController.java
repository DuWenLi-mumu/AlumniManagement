package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.entity.Class;
import com.sjtu.alumnimanagement.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/class")
public class ClassController {
    @Autowired
    ClassService classService;


    @CrossOrigin
    @GetMapping(path = "/getAll")
    public List<Class> getAllClassInfo(){
        return classService.getAllClass();
    }

    @CrossOrigin
    @GetMapping(path = "/getById")
    public Class getById(@RequestParam int id) {
        System.out.println("getById");
        return classService.getClassById(id);
    }


}
