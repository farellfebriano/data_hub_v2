package com.example.demo.repositories;


import com.example.demo.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface AddressRepositories extends JpaRepository<AddressEntity, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM studentDatabase.address")
    List<AddressEntity> findalladdresses();
}
