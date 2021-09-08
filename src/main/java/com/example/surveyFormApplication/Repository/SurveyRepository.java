package com.example.surveyFormApplication.Repository;

import com.example.surveyFormApplication.Model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey,Integer> {
}
