package com.lukacode.restful_Web_Services_Demo.user;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Integer id);
    User save(User userToSave);
    void deleteById(Integer id);
}
