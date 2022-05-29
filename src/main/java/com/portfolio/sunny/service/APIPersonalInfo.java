package com.portfolio.sunny.service;

import com.portfolio.sunny.model.PersonalInfo;
import com.portfolio.sunny.repository.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class APIPersonalInfo {

    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    public List<PersonalInfo> getAllPersonalInfo() {
        List<PersonalInfo> info= new ArrayList<>();
        personalInfoRepository.findAll().forEach(info::add);
        return  info;
    }

    public PersonalInfo saveService(PersonalInfo personalInfo) {
        return  personalInfoRepository.save(personalInfo);
    }
    public PersonalInfo updatePersonalInfo(Integer id,PersonalInfo personalInfo) {
      Optional<PersonalInfo> optionalService= personalInfoRepository.findById(id);

       if(optionalService.isPresent()){
          PersonalInfo updateableService=optionalService.get();
        updateableService.setName(personalInfo.getName());
        updateableService.setAge(personalInfo.getAge());
        updateableService.setAddress(personalInfo.getAddress());
        updateableService.setPhoneno(personalInfo.getPhoneno());
        updateableService.setEmail(personalInfo.getEmail());
        updateableService.setDescription(personalInfo.getDescription());

return personalInfoRepository.save(updateableService);

    }else{
           return null;
       }
}

    public void deletePersonalInfo(Integer id) {
        personalInfoRepository.deleteById(id);


    }
}