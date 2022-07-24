package com.example.mysamplespringapi.repository;

import com.example.mysamplespringapi.model.Animal;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class AnimalRepository implements IAnimalRepository {
    List<Animal> animals = new ArrayList<>();

    public AnimalRepository() {
        animals.add(new Animal(
                UUID.randomUUID().toString(),
                "Jeff",
                "Dog"
        ));

        animals.add(new Animal(
                UUID.randomUUID().toString(),
                "Jose",
                "Cat"
        ));

        animals.add(new Animal(
                UUID.randomUUID().toString(),
                "Gerald",
                "Capybara"
        ));
    }

    public List<Animal> getAllAnimals() {
        return animals;
    }

    public Animal getAnimalById(String id){
        return animals.stream().filter(animal -> animal.id.equals(id)).findFirst().orElseThrow(() -> new IllegalArgumentException("animal not found"));
    }

    public Animal createAnimal(Animal animal){
        animals.add(animal);
        return animal;
    }

    public void updateAnimal(Animal animal, String id){
        Animal existing = animals.stream().filter(a -> a.id.equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("animal not found"));
        int i = animals.indexOf(existing);
        animals.set(i, animal);
    }

    public void deleteAnimal(String id) {
        animals.removeIf(animal -> animal.id.equals(id));
    }
}
