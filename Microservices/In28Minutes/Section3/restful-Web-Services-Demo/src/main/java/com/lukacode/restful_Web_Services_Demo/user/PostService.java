package com.lukacode.restful_Web_Services_Demo.user;

import java.util.List;

public interface PostService {
    Post save(Post postToSave);
    List<Post> findAll();
}
