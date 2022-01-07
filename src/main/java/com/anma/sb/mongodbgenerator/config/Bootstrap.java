package com.anma.sb.mongodbgenerator.config;

import com.anma.sb.mongodbgenerator.models.City;
import com.anma.sb.mongodbgenerator.repo.CatRepo;
import com.anma.sb.mongodbgenerator.repo.CityRepo;
import com.anma.sb.mongodbgenerator.repo.CountryRepo;
import com.anma.sb.mongodbgenerator.repo.PersonRepo;
import com.anma.sb.mongodbgenerator.serv.convert.CatToWebCat;
import com.anma.sb.mongodbgenerator.serv.convert.CityConverter;
import com.anma.sb.mongodbgenerator.serv.convert.CountryConverter;
import com.anma.sb.mongodbgenerator.serv.convert.PersonConverter;
import com.anma.sb.mongodbgenerator.serv.web.CatService;
import com.anma.sb.mongodbgenerator.serv.web.CityService;
import com.anma.sb.mongodbgenerator.serv.web.CountryService;
import com.anma.sb.mongodbgenerator.serv.web.PersonWebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final PersonRepo personRepo;
    private final CatRepo catRepo;
    private final CountryRepo countryRepo;
    private final CityRepo cityRepo;
    private final PersonWebService personService;
    private final PersonConverter personConverter;
    private final CatToWebCat catToWebCat;
    private final CountryConverter countryConverter;
    private final CityConverter cityConverter;
    private final CountryService countryService;
    private final CityService cityService;
    private final CatService catService;

    private final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public Bootstrap(PersonRepo personRepo, CatRepo catRepo, CountryRepo countryRepo,
                     CityRepo cityRepo, PersonWebService personService,
                     PersonConverter personConverter,
                     CatToWebCat catToWebCat, CountryConverter countryConverter,
                     CityConverter cityConverter, CountryService countryService,
                     CityService cityService, CatService catService) {
        this.personRepo = personRepo;
        this.catRepo = catRepo;
        this.countryRepo = countryRepo;
        this.cityRepo = cityRepo;
        this.personService = personService;
        this.personConverter = personConverter;
        this.catToWebCat = catToWebCat;
        this.countryConverter = countryConverter;
        this.cityConverter = cityConverter;
        this.countryService = countryService;
        this.cityService = cityService;
        this.catService = catService;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("loading data in Bootstrap");
        loadData();
    }

    private void loadData() {

        // City

        cityService.allCities().forEach(cw -> {
            City city = cityConverter.convert(cw);
            System.out.println(city);
            cityRepo.save(city);
        });

        // Create CATS
//        catService.allCats().forEach(catWeb -> {
//            catRepo.save(catToWebCat.convert(catWeb));
//        });

        // Create Persons
//        personService.allPersons().forEach(p -> {
//            personRepo.save(personConverter.convert(p));
//        });

        // create Countries
//        countryService.allCountries().forEach( cw -> {
//            Country country = countryConverter.convert(cw);
//            countryRepo.save(country);
//        });

    }
}
