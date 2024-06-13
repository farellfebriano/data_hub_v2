package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Transactional
@Entity
@NoArgsConstructor
@Table(name = "students")
public class StudentEntity {

    // specify the stratefy for generating primary key values for an entity
    @Id
    @SequenceGenerator(name = "studentIdGenerator", allocationSize = 1)
    // allocationSize --> meaning
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // entity will have its value automatically generated by the database upon insertion of new "product
    private Integer student_ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID")
    private AddressEntity addressEntity;

    @OneToMany(cascade = CascadeType.ALL)
    List<ClassWorkEntity> classWorkEntity;

    @Column(name = "Name")
    private String name;

    @Column(name = "Major")
    private String major;

    @Column(name = "Age")
    private int age;


    @Column(name = "Email")
    private String email;


    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public List<ClassWorkEntity> getClassWorkEntity() {
        return classWorkEntity;
    }

    public void setClassWorkEntity(List<ClassWorkEntity> classWorkEntity) {
        this.classWorkEntity = classWorkEntity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
