package com.example.demo.repositories;

import com.example.demo.entities.ClassWorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassWorkRepositories  extends JpaRepository<ClassWorkEntity, Integer> {
}
