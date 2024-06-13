package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
@Entity
@Table(name = "ClassWork")

public class ClassWorkEntity {

    @Id
    @SequenceGenerator(name = "ClassWorkIdGenerator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ClassWorkId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_ID")
    private StudentEntity studentEntity;

    @Column(name="ID")
    private String classID;

    @Column(name="room")
    private String room;

    @Column(name="teacher")
    private String teacher;

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public Integer getClassWorkId() {
        return ClassWorkId;
    }

    public void setClassWorkId(Integer classWorkId) {
        ClassWorkId = classWorkId;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
