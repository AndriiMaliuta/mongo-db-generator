package com.anma.sb.mongodbgenerator.serv.web;

import com.anma.sb.mongodbgenerator.models.Country;
import com.anma.sb.mongodbgenerator.models.web.CityWeb;
import com.anma.sb.mongodbgenerator.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityServiceImpl implements CityService {

    private final RestTemplate template = new RestTemplate();
    private WebClient webClient = WebClient.create();
    private final CountryRepo countryRepo;
    private final String URL = "https://restcountries.com/v3.1/capital/";

    @Autowired
    public CityServiceImpl(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    @Override
    public List<CityWeb> allCities() {

        List<CityWeb> cities = new ArrayList<>();

        List<String> capitals = countryRepo.findAll()
                .stream().map(Country::getCapital).collect(Collectors.toList());

        capitals.forEach(cap -> {
            try {
                if (cap != null) {

                    CityWeb[] cityWebArr =
                            webClient.get().uri(URI.create(URL + cap)).retrieve().bodyToMono(CityWeb[].class).block();   //todo - error with space in name
                    CityWeb cityWeb = cityWebArr[0];

                    System.out.println(cityWeb);
                    cities.add(cityWeb);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        return cities;
    }

    @Override
    public CityWeb cityById() {
        return null;
    }
}
