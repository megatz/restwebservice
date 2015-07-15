package com.megatz.controller;

import com.megatz.dto.Persona;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/service/greeting/")
public class MovieController {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Persona getGreeting(@PathVariable String name) {
        String result="Hello "+name;
        Persona persona = new Persona();
        persona.setName("asdfasdf");
        persona.setLastName("kkkkkkkkkkk");
        return persona;
    }
}
