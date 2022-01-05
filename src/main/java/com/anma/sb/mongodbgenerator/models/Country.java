package com.anma.sb.mongodbgenerator.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Country {

    @Id
    @Field("countryId")
    private String id;
    private long area;
    private long population;
    private String status;
    private String cca2;
    private String code;
//    private Tld tld;
    private String name;
//    @Field(name = "continentName")
    private String continentName;
    private String region;
    private String capital;
    private String languages;
    private String borders;
    private String continents;
    private boolean independent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getBorders() {
        return borders;
    }

    public void setBorders(String borders) {
        this.borders = borders;
    }

    public String getContinents() {
        return continents;
    }

    public void setContinents(String continents) {
        this.continents = continents;
    }

    public boolean isIndependent() {
        return independent;
    }

    public void setIndependent(boolean independent) {
        this.independent = independent;
    }
}
