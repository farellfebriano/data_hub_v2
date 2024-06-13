package com.example.demo.POJO;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;


/* // Indicate that only properties with non-null valuess should be included or excluded
 * // durring the serializatoin to json format. in this case, "@JsonInclude(JsonInclude.
 * // Include.NON_NULL)" indicates that only non-null properties will be included in the json output*/
@JsonInclude(JsonInclude.Include.NON_NULL)
// I don't think this need to be used because we trying to desentralized a json into object
@JsonPropertyOrder({
        "request"
})
/* // annotation that is commonly used to marked elements that were generated auto
 * // automatically by tool or framework. In this case, jsonschema2pojo is the popular tool
 * // for generating java classes from JSON schema definitions*/
@Generated("jsonschema2pojo")
@ToString
public class MasterObjectPojo {
    /*
        // part of jackson library that will be used to specify the name of the property
        // as it appears in the JSON representation when serializing or deserializing objects
     */
    @JsonProperty("request")
    private RequestPojo requestPojo;
    // this code intended to store any data letter that is not itended
    // Hence we put jsonIgnore at placewhat\
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("request")
    public RequestPojo getRequest() {
        return requestPojo;
    }

    @JsonProperty("request")
    public void setRequest(RequestPojo requestPojo) {
        this.requestPojo = requestPojo;
    }

    /*
     * @JsonAnyGetter & @JsonAnySetter is the Jackson library to dynamically
     * include additional properties in the json representation of an object*/
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}


// NOTE -->
/*
//  Schema Definition: JSON Schema provides
//  a way to define the structure of JSON documents.
//  It allows you to specify the properties that can
//  appear in a JSON object, their data types,
//  and any additional constraints or validation rules.
 */