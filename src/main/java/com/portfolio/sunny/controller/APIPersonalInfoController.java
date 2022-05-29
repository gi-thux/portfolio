package com.portfolio.sunny.controller;
import com.portfolio.sunny.model.PersonalInfo;
import com.portfolio.sunny.service.APIPersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIPersonalInfoController {

    @Autowired
    private APIPersonalInfo apiPersonalInfo;

    @GetMapping(value = "/api/personal-info")
    public List<PersonalInfo> getPersonalInfo() {
        return apiPersonalInfo.getAllPersonalInfo();
    }

    @PostMapping(value = "/api/personal-info")
    public PersonalInfo createPersonalInfo(@RequestBody PersonalInfo personalInfo) {
        return apiPersonalInfo.saveService(personalInfo);
    }

    @PutMapping(value = "/api/personal-info/{id}")
    public String updatePersonalInfo(@PathVariable(name = "id") Integer id, @RequestBody PersonalInfo personalInfo) {
        System.out.println(personalInfo);
        PersonalInfo updateService = apiPersonalInfo.updatePersonalInfo(id, personalInfo);
        if (updateService == null) {
            return "error";
        }
            return "success";
        }
        @DeleteMapping(value="/api/personal-info/{id}")
        public String deletePersonalInfo(@PathVariable(name="id") Integer id){
        apiPersonalInfo.deletePersonalInfo(id);
return"success";
        }

    }
