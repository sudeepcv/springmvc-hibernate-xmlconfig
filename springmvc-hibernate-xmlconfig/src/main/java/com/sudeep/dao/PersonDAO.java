package com.sudeep.dao;

import java.util.List;

import com.sudeep.entity.Person;

public interface PersonDAO{
    public  void save(Person person);
    public List<Person> people();
    
 }
