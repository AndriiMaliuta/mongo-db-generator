package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.City;
import com.anma.sb.mongodbgenerator.models.web.CityWeb;
import com.anma.sb.mongodbgenerator.repo.CountryRepo;
import com.anma.sb.mongodbgenerator.serv.web.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CityConverterImpl implements CityConverter {

    private final CountryService countryService;

    public CityConverterImpl(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public City convert(CityWeb cityWeb) {
        City city = new City();
        city.setName(cityWeb.getCapital()[0]);
        city.setCode(cityWeb.getCca2());
        city.setContinent(String.join(",", cityWeb.getContinents()));
        city.setRegion(cityWeb.getRegion());
        city.setSubregion(cityWeb.getSubregion());
        city.setStatus(cityWeb.getStatus());
        city.setIndependent(cityWeb.isIndependent());
        city.setUnMember(cityWeb.isUnMember());
        city.setPopulation(cityWeb.getPopulation());
        city.setCountryId(countryService.getByCapital(cityWeb.getCapital()[0]).getId());
        return city;
    }

    @Override
    public CityWeb convert(City city) {
        return null;
    }
}
