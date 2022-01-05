package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.Person;
import com.anma.sb.mongodbgenerator.models.web.PersonWeb;

public interface PersonConverter {
    Person convert(PersonWeb personWeb);
    PersonWeb convert(Person person);
}
