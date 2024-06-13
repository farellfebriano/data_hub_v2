package com.example.demo.POJO;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "student"
})
@Generated("jsonschema2pojo")
@ToString

public class RequestPojo {
    @JsonProperty("student")
    private StudentPojo studentPojo;

    @JsonIgnore
    private Map<String, Object> setAdditionalProperties = new HashMap<>();

    @JsonProperty("student")
    public StudentPojo getStudent() {
        return studentPojo;
    }

    @JsonProperty("student")
    public void setStudent(StudentPojo studentPojo) {
        this.studentPojo = studentPojo;
    }

    @JsonGetter
    public Map<String, Object> getSetAdditionalProperties() {
        return setAdditionalProperties;
    }

    @JsonAnySetter
    public void setSetAdditionalProperties(Map<String, Object> setAdditionalProperties) {
        this.setAdditionalProperties = setAdditionalProperties;
    }

}
