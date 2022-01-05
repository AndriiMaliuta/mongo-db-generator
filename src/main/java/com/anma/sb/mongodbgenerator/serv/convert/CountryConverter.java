package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.Country;
import com.anma.sb.mongodbgenerator.models.web.CountryWeb;

public interface CountryConverter {
    Country convert(CountryWeb countryWeb);
    CountryWeb convert(Country country);
}
