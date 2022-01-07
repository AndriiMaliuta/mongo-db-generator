package com.anma.sb.mongodbgenerator.config;

import com.anma.sb.mongodbgenerator.models.Car;
import com.anma.sb.mongodbgenerator.models.Person;
import com.anma.sb.mongodbgenerator.repo.*;
import com.anma.sb.mongodbgenerator.serv.convert.*;
import com.anma.sb.mongodbgenerator.serv.web.*;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final PersonRepo personRepo;
    private final CarService carService;
    private final CatRepo catRepo;
    private final CarRepo carRepo;
    private final CountryRepo countryRepo;
    private final CityRepo cityRepo;
    private final PersonWebService personService;
    private final PersonConverter personConverter;
    private final CatToWebCat catToWebCat;
    private final CountryConverter countryConverter;
    private final CarConverter carConverter;
    private final CityConverter cityConverter;
    private final CountryService countryService;
    private final CityService cityService;
    private final CatService catService;

    private final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public Bootstrap(PersonRepo personRepo, CarService carService,
                     CatRepo catRepo, CarRepo carRepo, CountryRepo countryRepo,
                     CityRepo cityRepo, PersonWebService personService,
                     PersonConverter personConverter,
                     CatToWebCat catToWebCat, CountryConverter countryConverter,
                     CarConverter carConverter, CityConverter cityConverter,
                     CountryService countryService,
                     CityService cityService, CatService catService) {
        this.personRepo = personRepo;
        this.carService = carService;
        this.catRepo = catRepo;
        this.carRepo = carRepo;
        this.countryRepo = countryRepo;
        this.cityRepo = cityRepo;
        this.personService = personService;
        this.personConverter = personConverter;
        this.catToWebCat = catToWebCat;
        this.countryConverter = countryConverter;
        this.carConverter = carConverter;
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

        // CAR
//        for (int i = 0; i < 100; i++) {
//                Car car = carRepo.findAll().get(RandomUtils.nextInt(1, 120));
//                Car newCar = new Car(car, personService.getPersRandomId());
//                logger.info("Car saved " + newCar.toString());
//                carRepo.save(newCar);
//        }

        // initial
//        carService.alLCars().forEach(cw -> {
//            Car car = carConverter.convert(cw);
//            logger.info(car);
//            carRepo.save(car);
//        });

        // CITY

//        cityService.allCities().forEach(cw -> {
//            City city = cityConverter.convert(cw);
//            System.out.println(city);
//            cityRepo.save(city);
//        });

        // Create CATS
//        catService.allCats().forEach(catWeb -> {
//            catRepo.save(catToWebCat.convert(catWeb));
//        });

        // Create Persons
//        personService.allPersons().forEach(p -> {
//            personRepo.save(personConverter.convert(p));
//        });
//        for (int i = 0; i < 500; i++) {
//            Person person = personService.addPerson();
//            logger.info("Person saved " + person);
//        }

        // Countries
//        countryService.allCountries().forEach( cw -> {
//            Country country = countryConverter.convert(cw);
//            countryRepo.save(country);
//        });

    }
}
