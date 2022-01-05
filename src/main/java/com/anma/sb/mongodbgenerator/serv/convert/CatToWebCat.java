package com.anma.sb.mongodbgenerator.serv.convert;

import com.anma.sb.mongodbgenerator.models.Cat;
import com.anma.sb.mongodbgenerator.models.web.CatWeb;

public interface CatToWebCat {
    public Cat convert(CatWeb catWeb);
    public CatWeb convert(Cat cat);
}
