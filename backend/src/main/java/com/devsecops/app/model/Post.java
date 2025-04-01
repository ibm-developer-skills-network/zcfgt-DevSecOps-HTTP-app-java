package com.devsecops.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Post model representing a forum post
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private Long id;
    private Long postID;
    private String name;
    private String email;
    private String body;
    
    // Explicit getters and setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getPostID() {
        return postID;
    }
    
    public void setPostID(Long postID) {
        this.postID = postID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getBody() {
        return body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
}
