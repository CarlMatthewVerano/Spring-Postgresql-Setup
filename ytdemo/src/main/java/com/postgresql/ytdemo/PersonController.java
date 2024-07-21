package com.postgresql.ytdemo;

import com.postgresql.ytdemo.model.Person;
import com.postgresql.ytdemo.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepo personRepo;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        personRepo.save(person);
    }

    @PostMapping("/deletePerson")
    public void deletePerson(@RequestBody Person person) {
        personRepo.delete(person);
    }

    @PostMapping("/updatePerson")
    public void updatePerson(@RequestBody Person person) {
        personRepo.save(person);
    }
}
