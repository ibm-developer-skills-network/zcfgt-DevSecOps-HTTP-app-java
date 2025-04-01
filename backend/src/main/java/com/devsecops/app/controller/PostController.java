package com.devsecops.app.controller;

import com.devsecops.app.model.Post;
import com.devsecops.app.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * REST controller for handling HTTP requests
 * Equivalent to the Express.js routes in app.js
 */
@RestController
public class PostController {
    
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    
    private final PostService postService;
    
    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }
    
    /**
     * Root endpoint
     * @return Application information
     */
    @GetMapping("/")
    public ResponseEntity<Map<String, String>> getRoot() {
        logger.info("Request for Root URL");
        
        Map<String, String> response = new HashMap<>();
        response.put("name", "Data Retrieval Service");
        response.put("version", "1.0");
        
        return ResponseEntity.ok(response);
    }
    
    /**
     * Posts endpoint
     * @param count Number of posts to generate (optional)
     * @return List of posts
     */
    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts(@RequestParam(defaultValue = "5") int count) {
        List<Post> posts = postService.generatePosts(count);
        return ResponseEntity.ok(posts);
    }
}
