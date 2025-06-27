package com.lukacode.restful_Web_Services_Demo.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User userToSave) {
        return userRepository.save(userToSave);
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
