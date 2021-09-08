package com.example.surveyFormApplication.Controller;

import com.example.surveyFormApplication.Model.Survey;
import com.example.surveyFormApplication.Repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",allowedHeaders = "*") //front and backend connection handle
@RestController
public class SurveyController {

    @Autowired
    private SurveyRepository surveyRepository;

    @PostMapping ("/createSurvey")
    public String createSurvey(@RequestBody Survey surveyData){
        surveyRepository.save(surveyData);
        return "Form Submitted";
    }

}
