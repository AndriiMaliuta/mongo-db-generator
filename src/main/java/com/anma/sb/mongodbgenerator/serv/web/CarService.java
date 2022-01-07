package com.anma.sb.mongodbgenerator.serv.web;


import com.anma.sb.mongodbgenerator.models.web.CarWeb;

import java.util.List;

public interface CarService {

    List<CarWeb> alLCars();
    CarWeb carById(String id);

}
