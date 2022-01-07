package com.anma.sb.mongodbgenerator.repo;

import com.anma.sb.mongodbgenerator.models.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepo extends MongoRepository<Car, String> {
}
