package com.example.demo.POJO;
import com.fasterxml.jackson.annotation.*;

import java.util.List;
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

    @JsonProperty("class_work")
    private List<ClassWorkPojo> classWorkPojo;

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
    public List<ClassWorkPojo> getClassWorkPojo() {
        return classWorkPojo;
    }

    @JsonAnySetter
    public void setClassWorkPojo(List<ClassWorkPojo> classWorkPojo) {
        this.classWorkPojo = classWorkPojo;
    }
}
