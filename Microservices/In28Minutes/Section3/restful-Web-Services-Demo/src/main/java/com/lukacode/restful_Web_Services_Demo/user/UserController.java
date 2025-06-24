package com.lukacode.restful_Web_Services_Demo.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/userIntegration")
public class UserController {
    private final UserDaoService userDaoService;

    @Autowired
    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userDaoService.findAll();
    }

    @GetMapping("/users/{userId}")
    public User retrieveUserById(@PathVariable("userId") Integer id){
        var user=userDaoService.getUserById(id);
        if(user==null){
            throw new UserNotFoundException("id: "+id);
        }
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User userToAdd){
        var user=userDaoService.save(userToAdd);

        URI location= ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }

    @DeleteMapping("/users/{userId}")
    public void deleteUserById(@PathVariable("userId") Integer id){
        userDaoService.deleteById(id);
    }
}
