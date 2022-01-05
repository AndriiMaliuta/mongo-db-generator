package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.Cat;
import com.anma.sb.mongodbgenerator.models.web.CatWeb;
import com.anma.sb.mongodbgenerator.repo.PersonRepo;
import com.anma.sb.mongodbgenerator.serv.web.PersonWebService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CatToWebCatImpl implements CatToWebCat {

    private final PersonRepo personRepo;
    private final PersonWebService personWebService;

    public CatToWebCatImpl(PersonRepo personRepo, PersonWebService personWebService) {
        this.personRepo = personRepo;
        this.personWebService = personWebService;
    }

    @Override
    public Cat convert(CatWeb catWeb) {
        Cat cat = new Cat();
        cat.setId(catWeb.getId());
        cat.setAge(new Random().nextInt(17));
        cat.setCountryCodes(catWeb.getCountryCodes());;
        cat.setAdaptability(catWeb.getAdaptability());
        cat.setDogFriendly(catWeb.getDogFriendly());
        cat.setHairless(catWeb.getHairless());
        cat.setIndoor(catWeb.getIndoor());
        cat.setIntelligence(catWeb.getIntelligence());
        cat.setWikipediaUrl(catWeb.getWikipediaUrl());
        cat.setOrigin(catWeb.getOrigin());
        cat.setName(Faker.instance().cat().name());
        cat.setBreed(Faker.instance().cat().breed());
        cat.setRegistry(Faker.instance().cat().registry());
        cat.setPersonId(personWebService.getPersRandomId());        // todo - change to get real ids
        return cat;
    }

    @Override
    public CatWeb convert(Cat cat) {
        return null;
    }
}
