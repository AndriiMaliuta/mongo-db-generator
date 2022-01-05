package com.anma.sb.mongodbgenerator.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(value = "comments")
public class Comment {

    @Id
    @Field("commentId")
    public String id;
    public String body;
    public String category;
    public LocalDateTime createdAt;
    public String authorId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

//    public String getAuthorIdStr() {
//        return authorIdStr;
//    }
//
//    public void setAuthorIdStr(String authorIdStr) {
//        this.authorIdStr = authorIdStr;
//    }
}
