package com.example.Demo.api;

import com.example.Demo.model.Person;
import com.example.Demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired //for dependency injection
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping //To tell spring that this method is for POST
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }
}
