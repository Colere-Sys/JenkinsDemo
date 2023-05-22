package com.training.idea.services;


import com.training.idea.models.Person;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImplementation {

    @PostConstruct
    public void show(){
        System.out.println("I'm here!!");
    }

    @Transactional
    public void changeFirstname(Person person, String newFirstname) {
        person.setFirstname(newFirstname);
        //save the person in the database...
    }

    public void sendToPartner(Person person) {
        // send to another API
    }
}
