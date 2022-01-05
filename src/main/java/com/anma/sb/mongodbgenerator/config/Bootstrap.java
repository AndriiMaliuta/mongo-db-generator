package com.anma.sb.mongodbgenerator.config;

import com.anma.sb.mongodbgenerator.repo.CountryRepo;
import com.anma.sb.mongodbgenerator.repo.PersonRepo;
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

    private final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public Bootstrap(PersonRepo personRepo, CountryRepo countryRepo, PersonWebService personService) {
        this.personRepo = personRepo;
        this.countryRepo = countryRepo;
        this.personService = personService;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("loading data in Bootstrap");
        loadData();
    }

    private void loadData() {

//        countryRepo.findAll().forEach(System.out::println);
        personService.allPersons().forEach(System.out::println);
    }
}
