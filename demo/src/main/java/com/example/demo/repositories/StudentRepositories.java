package com.example.demo.repositories;

import com.example.demo.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepositories extends JpaRepository<StudentEntity, Integer> {
    @Query(nativeQuery =true, value = "SELECT * FROM studentDatabase.students s WHERE s.name=?1 ")
    StudentEntity findByName(String name);
}
