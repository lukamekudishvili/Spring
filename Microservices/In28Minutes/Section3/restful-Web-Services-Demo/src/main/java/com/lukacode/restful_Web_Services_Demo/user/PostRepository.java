package com.lukacode.restful_Web_Services_Demo.user;


import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
