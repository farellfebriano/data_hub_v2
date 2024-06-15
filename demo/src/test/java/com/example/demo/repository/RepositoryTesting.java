package com.example.demo.repository;


import com.example.demo.entities.StudentEntity;
import com.example.demo.repositories.StudentRepositories;
import org.junit.jupiter.api.Test;

import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

/*
* When this annotation is used, Spring Boot will auto-configure the necessary
* components to test JPA repositories, such as an embedded in-memory database,
* transaction management, and the EntityManager
* */

/*
 *  automatically configure the test database.
 */
@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class RepositoryTesting {

    @Autowired
    StudentRepositories studentRepositories;

    @Test
    public void StudentRepository_SaveAll_ReturnedSavedStudent(){

        //Arrange
        StudentEntity student= new StudentEntity();
        student.setAge(20);
        student.setName("laskar budi agustino");
        student.setEmail("laskar@aa.com");
        student.setMajor("Computer Science");

        //Act
        StudentEntity savedStudent = studentRepositories.save(student);

        //Assert
        Assertions.assertThat(savedStudent).isNotNull();
        Assertions.assertThat(savedStudent.getEmail().length()).isGreaterThan(0);

    }
    // Testing Get all student
    @Test
    public void StudentRepository_GetAll_ReturnMoreThenOneStudent(){
        // Arrange
        StudentEntity student1=new StudentEntity();
        student1.setName("Farell Febriano");
        student1.setEmail("farellfebriano8@gmail.com");
        student1.setMajor("computer science");
        student1.setAge(23);

        StudentEntity student2=new StudentEntity();
        student2.setName("Richard Alexander");
        student2.setEmail("RichardAlexander@gmail.com");
        student2.setAge(22);
        student2.setMajor("Cyber Security");

        //ACT
        studentRepositories.save(student1);
        studentRepositories.save(student2);
        List<StudentEntity> allStudent=studentRepositories.findAll();

        //ASSERT
        Assertions.assertThat(allStudent.size()).isNotZero();
    }
    @Test
    public void StudentRepository_GetID_ReturnMoreThenOneStudent() {

    }



}
