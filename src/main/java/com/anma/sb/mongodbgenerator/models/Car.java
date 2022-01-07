package com.anma.sb.mongodbgenerator.models;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document( "cars")
public class Car {

    @Id
    private String id;
    private long carId;
    private String model;
    private String color;
    private String registry;
    private String origin;
    private LocalDateTime createdAt;
    private String countryCodes;
    private int maxSpeed;
    private int age;
    private String personId;

    public Car() {
    }

    public Car(Car car, String persdonId) {
        this.setCarId(car.getCarId() + 1);
        this.setMaxSpeed(RandomUtils.nextInt(150, 300));
        this.setModel(car.getModel());
        this.setColor(car.getColor());
        this.setRegistry(car.getRegistry());
        this.setOrigin(car.getOrigin());
        this.setCreatedAt(LocalDateTime.now());
        this.setCountryCodes(car.getCountryCodes());
        this.setMaxSpeed(RandomUtils.nextInt(140, 300));
        this.setAge(RandomUtils.nextInt(1, 40));
        this.setPersonId(persdonId);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", registry='" + registry + '\'' +
                ", origin='" + origin + '\'' +
                ", createdAt=" + createdAt +
                ", countryCodes='" + countryCodes + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", age=" + age +
                ", personId='" + personId + '\'' +
                '}';
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
}