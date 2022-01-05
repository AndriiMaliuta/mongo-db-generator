package com.anma.sb.mongodbgenerator.config;

import com.anma.sb.mongodbgenerator.models.Country;
import com.anma.sb.mongodbgenerator.repo.CountryRepo;
import com.anma.sb.mongodbgenerator.repo.PersonRepo;
import com.anma.sb.mongodbgenerator.serv.convert.CountryConverter;
import com.anma.sb.mongodbgenerator.serv.convert.PersonConverter;
import com.anma.sb.mongodbgenerator.serv.web.CountryService;
import com.anma.sb.mongodbgenerator.serv.web.PersonWebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final PersonRepo personRepo;
    private final CountryRepo countryRepo;
    private final PersonWebService personService;
    private final PersonConverter personConverter;
    private final CountryConverter countryConverter;
    private final CountryService countryService;

    private final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public Bootstrap(PersonRepo personRepo, CountryRepo countryRepo,
                     PersonWebService personService, PersonConverter personConverter,
                     CountryConverter countryConverter, CountryService countryService) {
        this.personRepo = personRepo;
        this.countryRepo = countryRepo;
        this.personService = personService;
        this.personConverter = personConverter;
        this.countryConverter = countryConverter;
        this.countryService = countryService;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("loading data in Bootstrap");
        loadData();
    }

    private void loadData() {

        // Create Persons
//        countryRepo.findAll().forEach(System.out::println);
//        personService.allPersons().forEach(p -> {
//            personRepo.save(personConverter.convert(p));
//        });

        // create Countries
        countryService.allCountries().forEach( cw -> {
            Country country = countryConverter.convert(cw);
            countryRepo.save(country);
        });

    }
}
