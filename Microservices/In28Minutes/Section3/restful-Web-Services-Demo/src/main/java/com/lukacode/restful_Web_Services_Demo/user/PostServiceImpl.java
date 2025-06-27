package com.lukacode.restful_Web_Services_Demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post save(Post postToSave) {
        return postRepository.save(postToSave);
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
