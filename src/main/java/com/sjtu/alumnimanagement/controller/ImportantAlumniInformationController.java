package com.sjtu.alumnimanagement.controller;

import com.sjtu.alumnimanagement.entity.ImportantAlumniInformation;
import com.sjtu.alumnimanagement.service.ImportantAlumniInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/api/important_alumni_information")
public class ImportantAlumniInformationController {
    @Autowired
    ImportantAlumniInformationService importantAlumniInformationService;

    @CrossOrigin
    @GetMapping(path = "/getAll")
    public List<ImportantAlumniInformation> getAllUserInfo(){
        return importantAlumniInformationService.getAllImportantAlumniInformation();
    }

    @CrossOrigin
    @GetMapping(path = "/getById")
    public ImportantAlumniInformation getById(@RequestParam int id) {
        return importantAlumniInformationService.getImportantAlumniInformationById(id);
    }
}
