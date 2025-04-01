package com.devsecops.app.service;

import com.devsecops.app.model.Post;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Service for generating fake posts
 * Equivalent to postFactory.js in the Express application
 */
@Service
public class PostService {
    
    private final Faker faker;
    private final AtomicLong counter = new AtomicLong(0);
    
    public PostService() {
        this.faker = new Faker();
    }
    
    /**
     * Creates a single fake post
     * @return A post object
     */
    public Post createPost() {
        long id = counter.incrementAndGet();
        return new Post(
            id,
            1L,
            faker.name().fullName(),
            faker.internet().emailAddress(),
            faker.lorem().paragraph()
        );
    }
    
    /**
     * Generates multiple fake posts
     * @param count Number of posts to generate
     * @return List of post objects
     */
    public List<Post> generatePosts(int count) {
        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            posts.add(createPost());
        }
        return posts;
    }
}
