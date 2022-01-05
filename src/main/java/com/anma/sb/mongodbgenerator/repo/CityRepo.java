package com.anma.sb.mongodbgenerator.repo;

import com.anma.sb.mongodbgenerator.models.City;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepo extends MongoRepository<City, String> {
}
