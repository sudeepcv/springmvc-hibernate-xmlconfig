package com.sudeep.service;

import java.util.List;

import com.sudeep.dao.PersonDAO;
import com.sudeep.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDAO personDAO;

    @Override
    @Transactional
    public void save(Person person) {
        personDAO.save(person);

    }

    @Override
    @Transactional
    public List<Person> people() {
        return personDAO.people();
    }

}
