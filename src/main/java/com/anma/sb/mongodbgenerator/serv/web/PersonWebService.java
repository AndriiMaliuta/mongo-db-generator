package com.anma.sb.mongodbgenerator.serv.web;


import com.anma.sb.mongodbgenerator.models.web.PersonWeb;

import java.util.List;

public interface PersonWebService {

    PersonWeb getPersonById(long id);
    List<PersonWeb> allPersons();
    String getPersRandomId();
    List<PersonWeb> allPersonsClient();
    public List<String> personIds();
}
