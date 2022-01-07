package com.anma.sb.mongodbgenerator.serv.web;

import com.anma.sb.mongodbgenerator.models.Country;
import com.anma.sb.mongodbgenerator.models.web.CountryWeb;

import java.util.List;

public interface CountryService {

    CountryWeb getById(String id);
    CountryWeb getByName(String name);
    Country getByCapital(String capital);
    List<CountryWeb> allCountries();
    String getRandomId();
}
