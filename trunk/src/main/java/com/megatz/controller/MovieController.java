package com.megatz.controller;

import com.megatz.bo.BasicPerson;
import com.megatz.bo.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/service/greeting/")
public class MovieController {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public List<BasicPerson> getGreeting(@PathVariable String name) {
        String result="Hello "+name;
        List<BasicPerson> listaPersona= new ArrayList<>();
        Person person = new Person();
        person.setName("asdfasdf");
        person.setLastName("kkkkkkkkkkk");
        listaPersona.add(person);
        return listaPersona;
    }
}
