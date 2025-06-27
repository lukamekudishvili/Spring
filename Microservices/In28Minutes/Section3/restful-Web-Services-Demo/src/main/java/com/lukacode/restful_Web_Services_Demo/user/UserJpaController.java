package com.lukacode.restful_Web_Services_Demo.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/userIntegration/jpa")
public class UserJpaController {
    private final UserService userService;

    @Autowired
    public UserJpaController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userService.findAll();
    }

    @GetMapping(value="/users/{userId}")
    public User retrieveUserById(@PathVariable("userId") Integer id){
        var user=userService.findById(id);
        if(user == null){
            throw new UserNotFoundException("User not found with Id:%d".formatted(id));
        }
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User userToAdd){
        var user=userService.save(userToAdd);

        URI location= ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }

    @DeleteMapping("/users/{userId}")
    public void deleteUserById(@PathVariable("userId") Integer id){
        userService.deleteById(id);
    }
}
