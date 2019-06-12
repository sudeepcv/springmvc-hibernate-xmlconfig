package com.sudeep.service;

import java.util.List;

import com.sudeep.entity.Person;

public interface PersonService{
     public void save(Person person);

     public List<Person> people();
 }
