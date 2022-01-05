package com.anma.sb.mongodbgenerator.models.web;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class CommentWeb {

    public long id;
    public String body;
    public String category;
    public LocalDateTime createdAt;
    @JsonProperty(value = "author_id") public long authorId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }
}
