package com.anma.sb.mongodbgenerator.serv.web;

import com.anma.sb.mongodbgenerator.models.web.CatWeb;

import java.util.List;

public interface CatService {

    List<CatWeb> allCats();
    CatWeb catByBreed(String breed);
}
