package com.anma.sb.mongodbgenerator.serv;

public interface RandomService {

    String getColor();
    String getCountryCode();
    String getOrigin();
    int getAge(int max);
    String getBody(int length);
    int getRandomSpeed();

    String getRegistry();
}
