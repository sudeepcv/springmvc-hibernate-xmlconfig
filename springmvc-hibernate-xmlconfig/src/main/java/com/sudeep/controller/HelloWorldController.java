package com.sudeep.controller;




import java.util.List;

import com.sudeep.entity.Person;
import com.sudeep.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {


    @Autowired
    private PersonService personService;

	@GetMapping("/")
	public String hello() {
        System.out.println("inside hello");
		return "index";
	}

    	@GetMapping("/person")
	public String person() {
        System.out.println("save");
        Person person=new Person();
        person.setName("sudeep");
        person.setAge(29);
        personService.save(person);
        List<Person> people=personService.people();
        for(Person p:people){
            System.out.println(p.getName());

        }
       
		return "index";
	}

}