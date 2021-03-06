package com.anma.sb.mongodbgenerator.repo;

import com.anma.sb.mongodbgenerator.models.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CountryRepo extends MongoRepository<Country, String> {

//    @Query("")
    Country findByCapital(String capital);
}
