package com.anma.sb.mongodbgenerator.repo;

import com.anma.sb.mongodbgenerator.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentsRepo extends MongoRepository<Comment, String> {
}
