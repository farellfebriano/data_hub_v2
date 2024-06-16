package com.example.demo.controller;



import com.example.demo.entities.StudentEntity;
import com.example.demo.repositories.StudentRepositories;
import com.example.demo.service.MessageHandlerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class LocalController {

    @Autowired
    MessageHandlerImpl messageHandler;

    @Autowired
    StudentRepositories studentRepositories;

    @GetMapping(value = "/runcode", produces = MediaType.APPLICATION_JSON_VALUE)
    public String runCode() throws IOException {
        messageHandler.handleMessage();
        return "running code for local Testing";
    }

    @GetMapping(value = "/getallstudent")
    public List<StudentEntity> getAllStudent() throws IOException {
        return studentRepositories.findAll();
    }

    @GetMapping(value = "/student/{name}")
    public StudentEntity getStudentByName(@PathVariable String name) throws IOException {
        System.out.println(name);
        return studentRepositories.findByName(name);
    }



}
