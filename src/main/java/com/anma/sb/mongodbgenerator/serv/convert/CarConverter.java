package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.Car;
import com.anma.sb.mongodbgenerator.models.web.CarWeb;

public interface CarConverter {
    Car convert(CarWeb carWeb);
    CarWeb convert(Car car);
}
