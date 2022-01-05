package com.anma.sb.mongodbgenerator.repo;

import com.anma.sb.mongodbgenerator.models.Cat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatRepo extends MongoRepository<Cat, String> {
}
