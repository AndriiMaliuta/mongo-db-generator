package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.Person;
import com.anma.sb.mongodbgenerator.models.web.PersonWeb;
import com.anma.sb.mongodbgenerator.repo.CountryRepo;
import com.anma.sb.mongodbgenerator.serv.web.CountryService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class PersonConverterImpl implements PersonConverter {

    private final CountryRepo countryRepo;
    private final CountryService countryService;

    public PersonConverterImpl(CountryRepo countryRepo, CountryService countryService) {
        this.countryRepo = countryRepo;
        this.countryService = countryService;
    }

    @Override
    public Person convert(PersonWeb personWeb) {
        Random random = new Random();
        Person person = new Person();
        person.setId(personWeb.getId());
        person.setName(personWeb.getName());
        person.setFullName(personWeb.getName());
        person.setEmail(personWeb.getEmail());
        person.setGender(personWeb.getGender());
        person.setStatus(personWeb.getStatus());
        person.setAge(random.nextInt(90));
        person.setHasChildren(random.nextBoolean());
//                .countryCode(countryRepo.findById(RandomUtils.nextInt(403, 651)).get().getCode())
        person.setCountryCode(person.getCountryCode());
        person.setEngaged(random.nextBoolean());
        person.setCreatedAt(LocalDateTime.now());
        person.setCountryId(countryService.getRandomId());

        return person;

    }

    @Override
    public PersonWeb convert(Person person) {
        return null;
    }
}
