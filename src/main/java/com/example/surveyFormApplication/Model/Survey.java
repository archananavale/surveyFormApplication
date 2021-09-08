package com.example.surveyFormApplication.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Getter
@Setter
@Entity
public class Survey {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private Date dateOfMoving;
    private String gender;
    private String politicalPersuasion;


}
/*
enum  Gender{
    MALE,
    FEMALE,
    OTHER
};*/

