package com.training.idea.controllers;

import com.training.idea.models.Person;
import com.training.idea.services.PersonServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AboutController {
    @Autowired
    PersonServiceImplementation implementation;

    @GetMapping("/about")
    public String about() {
        return "This is my project IDEA version 1.0";
    }

    @PostMapping("/human")
    public String insert(@RequestBody Person human) {
        implementation.sendToPartner(human);
        String firstname = human.getFirstname();
        return firstname;
        // insert in the database
    }
}
