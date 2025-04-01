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
}
