package com.portfolio.sunny.controller;

import com.portfolio.sunny.model.*;
import com.portfolio.sunny.service.APIPersonalInfo;
import com.portfolio.sunny.service.APIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class APIController {
    @Autowired
    private APIService apiService;
    @GetMapping(value="/api/service")
    public List<PortfolioService> getServices(){
return apiService.getAllServices();
    }
 /*@GetMapping(value = "/api/test")
    public HashMap<String, Object> test() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "sunny chand");
        map.put("email", "sunny@gmail.com");
        map.put("age", 33);
        map.put("isActive", true);
        HashMap<String, String> another = new HashMap<>();
        another.put("test", "inside another");
        map.put("another", another);

        return map;
    }

    @GetMapping(value = "/api/test1")
    public PersonalInfo test1() {


        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setName("Sunny Chand");
        personalInfo.setAge(33);
        personalInfo.setAddress("MiddleTown,Newyork,USA");
        personalInfo.setEmail("sunnychand01111@gmail.com");
        personalInfo.setPhoneno("908-346-3022");
        personalInfo.setDescription("Working to make a bright future");
        //personalInfo.setAnother(new Another());
        return personalInfo;
    }

    @GetMapping(value = "/api/portfolioservice")
    public ArrayList<PortfolioService> service() {

        ArrayList<PortfolioService> services = new ArrayList<>();
        services.add(new PortfolioService("Spring Boot", "create Web application using spring boot", ""));
        services.add(new PortfolioService("Mobile app developer", "create Mobile application using spring boot", ""));
        services.add(new PortfolioService("Clerk App Developer", "create account application using spring boot", ""));

        return services;
    }

    @GetMapping(value = "/api/educations")
    public ArrayList<Education> educations() {
        ArrayList<Education> edu = new ArrayList<>();
        edu.add(new Education("2000-2001", "10th", "las", "it was best days"));
        return edu;
    }

    @GetMapping(value = "/api/skil")
    public Skills skills() {
        Skills skills = new Skills("running", 5);
        return skills;
    }

    @GetMapping(value="/api/experience")
    public ArrayList<Experience> experiences() {
        ArrayList<Experience> experiences = new ArrayList<>();
        experiences.add(new Experience("2013-2018", "Technician", "Buddha air", "maintained the Aircrafts"));
        experiences.add(new Experience("2018-2019", "mechanic", "Auto Repair", "repaired cars"));
        experiences.add(new Experience("2019-2020", "kitchen helper", "Himalayan Aroma", "dish washing, helping cook"));
        experiences.add(new Experience("2020-2021", "Developer", "MassMutual", "Sailpoint"));
        Collections.sort(experiences);
        return experiences;
    }*/
    @PostMapping(value="/api/service")
    public PortfolioService createService(@RequestBody @Valid PortfolioService portfolioService){
        System.out.println(portfolioService);
      return  apiService.saveService(portfolioService);
    }
    @PutMapping(value="/api/service/{id}")
    public String updateService(@PathVariable (name="id") Integer id,@RequestBody PortfolioService portfolioService ){
        System.out.println(id);
        System.out.println(portfolioService);
   PortfolioService updatedService=     apiService.updateService(id,portfolioService);
      if(updatedService== null){
          return "error";
      }
        return "success";

    }

    @DeleteMapping(value="/api/service/{id}")
    public String deleteService(@PathVariable(name="id") Integer id){
apiService.deleteService(id);
return "success";
    }

    }



