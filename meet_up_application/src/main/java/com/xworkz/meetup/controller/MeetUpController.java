package com.xworkz.meetup.controller;

import com.xworkz.meetup.dto.MeetupDetailsDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

@RequestMapping("/")
@Controller
public class MeetUpController {
    public MeetUpController(){
        System.out.println("MeetUpController created");
    }
    @PostMapping("/submit")
    public String acceptPostMethod(@ModelAttribute MeetupDetailsDto dto){
        System.out.println("acceptPostMethod() invoked");
        dto.setCreatedBy("Abisha");
        dto.setCreatedOn(LocalDateTime.now());
        System.out.println("dto is: "+dto);
        //save data into the database
        String url="jdbc:mysql://localhost:3306/meetup_info";
        String userName="root";
        String psw="Root@123";
        String query="insert into meetup(name, place, reason, time, date) values(?,?,?,?,?)";

        return "success.jsp";
    }
    @GetMapping
    public String acceptGetMethod(){
        System.out.println("acceptGetMethod() invoked");
        return "success.jsp";
    }
}
