package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.Car;
import com.anma.sb.mongodbgenerator.models.web.CarWeb;
import com.anma.sb.mongodbgenerator.serv.RandomService;
import com.anma.sb.mongodbgenerator.serv.web.PersonWebService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CarConverterImpl implements CarConverter {

    private final PersonWebService personWebService;
    private final RandomService randomService;

    public CarConverterImpl(PersonWebService personWebService, RandomService randomService) {
        this.personWebService = personWebService;
        this.randomService = randomService;
    }

    @Override
    public Car convert(CarWeb carWeb) {
        Car car = new Car();
        car.setCarId(carWeb.getCarId());
//        car.setId(UUID.randomUUID().toString());
        car.setAge(RandomUtils.nextInt(0, 30));
        car.setModel(carWeb.getBrand());   //brand -> model
        car.setPersonId(personWebService.getPersRandomId());
        car.setCountryCodes(randomService.getCountryCode()); // empty
        car.setOrigin(randomService.getOrigin()); // empty
        car.setColor(randomService.getColor());   // empty
        car.setRegistry(carWeb.getRegistry());
        car.setMaxSpeed(randomService.getRandomSpeed());

        return car;
    }

    @Override
    public CarWeb convert(Car car) {
        return null;
    }
}
