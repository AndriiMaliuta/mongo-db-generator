package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.City;
import com.anma.sb.mongodbgenerator.models.web.CityWeb;

public interface CityConverter {

    City convert(CityWeb cityWeb);
    CityWeb convert(City city);
}
