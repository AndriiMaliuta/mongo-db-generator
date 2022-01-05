package com.anma.sb.mongodbgenerator.models.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true, value = {"nativeName"})
//@JsonTypeInfo(
//        use = JsonTypeInfo.Id.NAME,
//        include = JsonTypeInfo.As.PROPERTY,
//        property = "name")
//@JsonSubTypes(
//        @JsonSubTypes.Type(value = CountryWeb.Name.class, name = "name")
//        @JsonSubTypes(
//                @JsonSubTypes.Type(value = CountryWeb.Name.NativeName.class, name = "name"),
//        })
//)
public class CountryWeb {

    private int id;
    private long area;
    private long population;
    private String status;
    @JsonProperty(value = "un_member")
    private String unMember;
    private String cca2;
    private String region;
    private boolean independent;
    private String[] tld;
    private String[] continents;
    private String[] borders;
    private Map<String, String> languages;
    private String[] capital;
    private Name name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getUnMember() {
        return unMember;
    }

    public void setUnMember(String unMember) {
        this.unMember = unMember;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isIndependent() {
        return independent;
    }

    public void setIndependent(boolean independent) {
        this.independent = independent;
    }

    public String[] getTld() {
        return tld;
    }

    public void setTld(String[] tld) {
        this.tld = tld;
    }

    public String[] getContinents() {
        return continents;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public String[] getBorders() {
        return borders;
    }

    public void setBorders(String[] borders) {
        this.borders = borders;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public String[] getCapital() {
        return capital;
    }

    public void setCapital(String[] capital) {
        this.capital = capital;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
