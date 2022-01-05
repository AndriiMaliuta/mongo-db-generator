package com.anma.sb.mongodbgenerator.serv;

import com.anma.sb.mongodbgenerator.models.Person;
import com.anma.sb.mongodbgenerator.models.web.PersonWeb;
import com.anma.sb.mongodbgenerator.repo.PersonRepo;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepo personRepo;

    public PersonServiceImpl(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public PersonWeb createPerson() {

        Person person = new Person();
        PersonWeb personWeb = new PersonWeb();

        return null;
    }
}
