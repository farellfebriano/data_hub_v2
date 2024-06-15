package com.example.demo.POJO;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "classID",
        "room",
        "teacher"
})
public class ClassWorkPojo {
    @JsonProperty("classID")
    private String classID;

    @JsonProperty("room")
    private String room;

    @JsonProperty("teacher")
    private String teacher;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("classID")
    public String getClassID() {
        return classID;
    }

    @JsonProperty("classID")
    public void setClassID(String classID) {
        this.classID = classID;
    }

    @JsonProperty("room")
    public String getRoom() {
        return room;
    }

    @JsonProperty("room")
    public void setRoom(String room) {
        this.room = room;
    }

    @JsonProperty("teacher")
    public String getTeacher() {
        return teacher;
    }

    @JsonProperty("teacher")
    public void setTeacher(String teacher) {
        this.teacher = teacher;
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
