package com.lukacode.restful_Web_Services_Demo.user;

import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/userIntegration/jpa")
public class PostController {
    private final UserService userService;
    private final PostService postService;

    @Autowired
    public PostController(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @GetMapping("/users/posts")
    public ResponseEntity<List<Post>> findAllPosts() {
        var posts=postService.findAll();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @GetMapping("/users/{userId}/posts")
    public ResponseEntity<List<Post>> findAllPostsForUser(@PathVariable Integer userId) {
        var user = userService.findById(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found with Id:%d".formatted(userId));
        }
        var posts = user.getPosts();
        if (posts == null || posts.isEmpty()) {
            throw new PostNotFoundException("Posts for user: %s not found".formatted(user.getName()));
        }
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @PostMapping("/users/{userId}/posts")
    public ResponseEntity<Object> createPostForUser(@PathVariable Integer userId, @Valid @RequestBody Post post) {
        var user = userService.findById(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found with Id:%d".formatted(userId));
        }
        post.setUser(user);

        var savedPost =postService.save(post);

        URI location= ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{userId}")
                .buildAndExpand(savedPost.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
