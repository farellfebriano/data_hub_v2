package com.example.demo.POJO;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "major",
        "age",
        "email"
})
@Generated("jsonschema2pojo")
@ToString
public class StudentPojo {

    @JsonProperty("name")
    private String name;
    @JsonProperty("major")
    private String major;
    @JsonProperty("age")
    private int age;
    @JsonProperty("email")
    private String email;
    @JsonProperty("address")
    private AddressPojo address;
    @JsonProperty("class_work")
    private List<ClassWorkPojo> classWork;


    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("major")
    public String getMajor() {
        return major;
    }

    @JsonProperty("major")
    public void setMajor(String major) {
        this.major = major;
    }

    @JsonProperty("age")
    public int getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("address")
    public AddressPojo getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(AddressPojo address) {
        this.address = address;
    }

    public List<ClassWorkPojo> getClassWork() {
        return classWork;
    }

    public void setClassWork(List<ClassWorkPojo> classWork) {
        this.classWork = classWork;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
