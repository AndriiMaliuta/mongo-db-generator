package com.anma.sb.mongodbgenerator.repo;

import com.anma.sb.mongodbgenerator.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepo extends MongoRepository<Person, String> {
}
