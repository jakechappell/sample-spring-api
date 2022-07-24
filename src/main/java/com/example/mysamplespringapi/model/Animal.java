package com.example.mysamplespringapi.model;

import java.util.Objects;

public class Animal {
    public String id;
    public String animalType;
    public String animalName;

    public Animal(){

    }

    public Animal(String id, String animalName, String animalType){
        this.id = id;
        this.animalName = animalName;
        this.animalType = animalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}
