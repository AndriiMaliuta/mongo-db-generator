package com.anma.sb.mongodbgenerator.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "cats")
public class Cat {

    @Id
    private long catId;
    private String id;
    private String name;
    private String color;
    private String breed;
    private String registry;
    private String origin;
    private int age;
    private int indoor;
    private int adaptability;
//    @Column(name = "dog_friendly") private int dogFriendly;
    private int intelligence;
    private int hairless;
//    @Column(name = "person_id") private long personId;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "person_id", referencedColumnName = "person_id")
//    private Person owner;

}