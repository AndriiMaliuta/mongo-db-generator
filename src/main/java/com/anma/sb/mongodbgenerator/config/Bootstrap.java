package com.anma.sb.mongodbgenerator.config;

import com.anma.sb.mongodbgenerator.models.*;
import com.anma.sb.mongodbgenerator.repo.*;
import com.anma.sb.mongodbgenerator.serv.RandomService;
import com.anma.sb.mongodbgenerator.serv.convert.*;
import com.anma.sb.mongodbgenerator.serv.web.*;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Bootstrap implements CommandLineRunner {

    private final PersonRepo personRepo;
    private final CarService carService;
    private final CatRepo catRepo;
    private final CarRepo carRepo;
    private final CountryRepo countryRepo;
    private final CommentsRepo commentsRepo;
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
    private final RandomService randomService;

    private final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public Bootstrap(PersonRepo personRepo, CarService carService,
                     CatRepo catRepo, CarRepo carRepo, CountryRepo countryRepo,
                     CommentsRepo commentsRepo, CityRepo cityRepo, PersonWebService personService,
                     PersonConverter personConverter,
                     CatToWebCat catToWebCat, CountryConverter countryConverter,
                     CarConverter carConverter, CityConverter cityConverter,
                     CountryService countryService,
                     CityService cityService, CatService catService,
                     RandomService randomService) {
        this.personRepo = personRepo;
        this.carService = carService;
        this.catRepo = catRepo;
        this.carRepo = carRepo;
        this.countryRepo = countryRepo;
        this.commentsRepo = commentsRepo;
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
        this.randomService = randomService;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("loading data in Bootstrap");
        loadData();
    }

    private void loadData() {

        // COMMENTS

        List<String> ids = personRepo.findAll().stream().map(Person::getPersonId).collect(Collectors.toList());
//        ids.forEach(System.out::println);

        for (int i = 1000; i < 3000; i++) {
            logger.info("[ ** ] creating comment");
            Comment comment = new Comment();
            comment.setId("comm" + i);
            comment.setBody(randomService.getBody(RandomUtils.nextInt(7, 30)));
            comment.setAuthorId(ids.get(RandomUtils.nextInt(1, 1600)));
            comment.setCategory(randomService.getColor());
            comment.setCreatedAt(LocalDateTime.of(2021,
                    Month.of(RandomUtils.nextInt(1, 12)),
                    RandomUtils.nextInt(1, 29),
                    RandomUtils.nextInt(1, 12),
                    RandomUtils.nextInt(1, 59)));
//                        commentRepoReactive.save(comment);
            commentsRepo.save(comment);
            logger.info("[ ** ] comments saved " + comment);
        }

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
//            logger.info(car.toString());
//            carRepo.save(car);
//        });

        // CITY from WEB URL

//        cityService.allCities().forEach(cw -> {
//            City city = cityConverter.convert(cw);
//            System.out.println(city);
//            cityRepo.save(city);
//        });

        // Create CATS from URL
//        catService.allCats().forEach(catWeb -> {
//            catRepo.save(catToWebCat.convert(catWeb));
//        });

        // Create Persons
//        personService.allPersons().forEach(p -> {
//            personRepo.save(personConverter.convert(p));
//            logger.info("Person saved " + p);
//        });
//        for (int i = 0; i < 200; i++) {
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
