package com.example.mysamplespringapi.controller;

import com.example.mysamplespringapi.model.Animal;
import com.example.mysamplespringapi.repository.AnimalRepository;
import com.example.mysamplespringapi.repository.IAnimalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private IAnimalRepository repository;
    public AnimalController(IAnimalRepository repo){
        repository = repo;
    }

    // GET http://localhost:8080/animals
    @GetMapping
    public List<Animal> getAllAnimals(){
        return repository.getAllAnimals();
    }

    // GET http://localhost:8080/animals/{id}
    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable String id){
        return repository.getAnimalById(id);
    }

    // POST http://localhost:8080/animals
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal){
        return repository.createAnimal(animal);
    }

    // PUT http://localhost:8080/animals/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void updateAnimal(@RequestBody Animal animal, @PathVariable String id){
        repository.updateAnimal(animal, id);
    }

    // DELETE http://localhost:8080/animals/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable String id){
        repository.deleteAnimal(id);
    }
}
