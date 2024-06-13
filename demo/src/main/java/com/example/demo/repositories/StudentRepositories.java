package com.example.demo.repositories;

import com.example.demo.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositories extends JpaRepository<StudentEntity, Integer> {
}
