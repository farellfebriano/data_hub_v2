package com.example.demo.builder;


import com.example.demo.POJO.ClassWorkPojo;
import com.example.demo.POJO.MasterObjectPojo;
import com.example.demo.entities.AddressEntity;
import com.example.demo.entities.ClassWorkEntity;
import com.example.demo.entities.StudentEntity;
import com.example.demo.repositories.AddressRepositories;
import com.example.demo.repositories.ClassWorkRepositories;
import com.example.demo.repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DAOBuilder {

    @Autowired
    StudentRepositories studentRepositories;

    @Autowired
    AddressRepositories addressRepositories;

    @Autowired
    ClassWorkRepositories classWorkRepositories;

    public void setAllEntities(MasterObjectPojo masterObjectPojo) {


        System.out.println("---> set all entities");
        //        SETTING STUDENT
        String name = masterObjectPojo.getRequest().getStudent().getName();
        String major = masterObjectPojo.getRequest().getStudent().getMajor();
        int age = masterObjectPojo.getRequest().getStudent().getAge();
        String email = masterObjectPojo.getRequest().getStudent().getEmail();
        //        SETTING ADDRESS

        String street = masterObjectPojo.getRequest().getStudent().getAddress().getStreet();
        String city = masterObjectPojo.getRequest().getStudent().getAddress().getCity();
        String state = masterObjectPojo.getRequest().getStudent().getAddress().getState();
        String zipcode = masterObjectPojo.getRequest().getStudent().getAddress().getZipcode();


        //         SETTING THE ADDRESS ENTITY
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setStreet(street);
        addressEntity.setCity(city);
        addressEntity.setState(state);
        addressEntity.setZipcode(zipcode);


        //         SETTING THE STUDENT ENTITY
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(name);
        studentEntity.setMajor(major);
        studentEntity.setAge(age);
        studentEntity.setEmail(email);
        studentEntity.setAddressEntity(addressEntity);
        studentRepositories.save(studentEntity);

        // calling setClassWork
        setClassWork(masterObjectPojo,studentEntity);


    }

    public void setClassWork(MasterObjectPojo masterObjectPojo, StudentEntity studentEntity){
        List<ClassWorkEntity>listOfClassWorkEntity=new ArrayList<>();
        masterObjectPojo.getRequest().getStudent().getClassWork().forEach(classWorkPojo->{
            ClassWorkEntity classWorkEntity=new ClassWorkEntity();
            classWorkEntity.setStudentEntity(studentEntity);
            classWorkEntity.setClassID(classWorkPojo.getClassID());
            classWorkEntity.setRoom(classWorkPojo.getRoom());
            classWorkEntity.setTeacher(classWorkPojo.getTeacher());
            listOfClassWorkEntity.add(classWorkEntity);
        });
        classWorkRepositories.saveAll(listOfClassWorkEntity);

    }
}


