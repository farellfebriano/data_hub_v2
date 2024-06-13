package com.example.demo.service;


import com.example.demo.POJO.MasterObjectPojo;
import com.example.demo.builder.DAOBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class MessageHandlerImpl {

    @Autowired
    DAOBuilder daoBuilder;
    @Autowired
    private ObjectMapper mapper;

    public void handleMessage() throws IOException {
        // needs to be change every time you use it if clone or run in other computer
        String filePath = "/Users/farellfebriano/Desktop/spring_boot/data_hub_clone_v1/mini_data_hub_v2/src/main/sampleData/studentsData.json";
        /*
            Paths.get(filePath) --> create an object from that path
            Files.readAllBytes(Paths.get(filePath)) --> class, reads all the bytes from a file and
                returns them as a byte array (byte[])
            String(Files.readAllBytes(Paths.get(filePath))) --> This constructs a new String object
                from the byte array returned by Files.readAllBytes().
         */
        String jsonStringFromFile = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(jsonStringFromFile);
        processMessage(jsonStringFromFile);
    }

    public void processMessage(String payload) {
        try {
            System.out.println("---> processing master object");
            MasterObjectPojo masterObjectPojo = mapMasterObject(payload);
            System.out.println("--><--");
            daoBuilder.setAllEntities(masterObjectPojo);
        } catch (Exception e) {
            System.out.println("---> Exception in processMessage method");
            System.out.println(e.getMessage());
        }
    }

    public MasterObjectPojo mapMasterObject(String payLoad) throws JsonProcessingException {
        System.out.println("---> Mapping master object");
        // create an MasterObject object
        return mapper.readValue(payLoad, MasterObjectPojo.class);

    }
}

