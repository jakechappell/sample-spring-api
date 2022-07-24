package com.example.mysamplespringapi.repository;

import com.example.mysamplespringapi.model.Animal;

import java.util.List;

public interface IAnimalRepository {
    public List<Animal> getAllAnimals();
    public Animal getAnimalById(String id);
    public Animal createAnimal(Animal animal);
    public void updateAnimal(Animal animal, String id);
    public void deleteAnimal(String id);
}
