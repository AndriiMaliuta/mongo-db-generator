package com.anma.sb.mongodbgenerator.serv.web;

import com.anma.sb.mongodbgenerator.models.Country;
import com.anma.sb.mongodbgenerator.models.web.CountryWeb;
import com.anma.sb.mongodbgenerator.repo.CountryRepo;
import com.anma.sb.mongodbgenerator.serv.convert.CountryConverter;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonFactoryBuilder;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private WebClient webClient = WebClient.create();
    private final RestTemplate template = new RestTemplate();
    private final CountryRepo countryRepo;
    //https://restcountries.com/v3.1/name/{name}
    //https://restcountries.com/#api-endpoints-v3-name

    private final Environment environment;
    private final CountryConverter countryConverter;

    public CountryServiceImpl(CountryRepo countryRepo,
                              Environment environment, CountryConverter countryConverter) {
        this.countryRepo = countryRepo;
        this.environment = environment;
        this.countryConverter = countryConverter;
    }

    @Override
    public CountryWeb getByName(String name) {
//        final String URL = environment.getProperty("links.countries.name");
        final String URL = "https://restcountries.com/v3.1/name/";
        JsonFactory factoryBuilder = new JsonFactoryBuilder().build();
        CountryWeb countryWeb = template.getForObject(URL + name, CountryWeb.class);
//        factoryBuilder.createParser(countryWeb)
        return countryWeb;
    }

    @Override
    public Country getByCapital(String capital) {
        return countryRepo.findByCapital(capital);
    }

    @Override
    public CountryWeb getById(String id) {
        return countryConverter.convert(countryRepo.findById(id).get());
    }


    @Override
    public List<CountryWeb> allCountries() {
        final String URL = environment.getProperty("links.countries");
        return Arrays.asList(template.getForObject(URL, CountryWeb[].class));
    }

    @Override
    public String getRandomId() {
        int last = countryRepo.findAll().size() - 1;
        return countryRepo.findAll().get(RandomUtils.nextInt(1, last)).getId();
    }
}
