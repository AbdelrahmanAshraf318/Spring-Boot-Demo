package com.example.Demo.service;

import com.example.Demo.dao.PersonDAO;
import com.example.Demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDAO personDao;

    @Autowired //For Dependency Injection
    public PersonService(@Qualifier("fakeDao") PersonDAO personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }
}
