package com.anma.sb.mongodbgenerator.serv.web;

import com.anma.sb.mongodbgenerator.models.web.CityWeb;

import java.util.List;

public interface CityService {

    List<CityWeb> allCities();
    CityWeb cityById();
}
