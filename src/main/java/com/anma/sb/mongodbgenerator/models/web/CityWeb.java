package com.anma.sb.mongodbgenerator.models.web;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class CityWeb {

    private String id;
    private Name name;
//    @JsonProperty(value = "countryCode")
    private String cca2;    // code
    private String[] continents;
    private String countryId;
    private String region;
    private String subregion;
    private String status;
    private String[] capital;
    private boolean independent;
    private boolean unMember;
    private long population;
    private long area;

    @Override
    public String toString() {
        return "CityWeb{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", cca2='" + cca2 + '\'' +
                ", continent='" + continents + '\'' +
                ", countryId='" + countryId + '\'' +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", status='" + status + '\'' +
                ", capital=" + Arrays.toString(capital) +
                ", independent=" + independent +
                ", unMember=" + unMember +
                ", population=" + population +
                ", area=" + area +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String[] getContinents() {
        return continents;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getCapital() {
        return capital;
    }

    public void setCapital(String[] capital) {
        this.capital = capital;
    }

    public boolean isIndependent() {
        return independent;
    }

    public void setIndependent(boolean independent) {
        this.independent = independent;
    }

    public boolean isUnMember() {
        return unMember;
    }

    public void setUnMember(boolean unMember) {
        this.unMember = unMember;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }
}
