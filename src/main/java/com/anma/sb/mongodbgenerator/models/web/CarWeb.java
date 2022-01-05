package com.anma.sb.mongodbgenerator.models.web;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarWeb {

    private long carId;
    private String id;
    private String model;
    private String color;
    private String registry;
    private String brand;
    private String origin;
    @JsonProperty(value = "country_codes") private String countryCodes;
    private int age;
    @JsonProperty(value = "person_id") private long personId;
}
