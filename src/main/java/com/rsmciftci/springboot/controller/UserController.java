package com.rsmciftci.springboot.controller;

import com.rsmciftci.springboot.entity.User;
import com.rsmciftci.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    @Autowired
    private UserService userService;

    // (3.1)
    // finds all users and returns them
    @GetMapping("")
    public List<User> findAll(){
        return userService.findAll();
    }

    // (3.2)
    // finds user by user's id and returns user
    @GetMapping({"{userId}"})
    public User findById(@PathVariable String userId){
        return userService.findById(userId);
    }

    //(3.3)
    // Saves User and if saving process is successful
    // it returns HttpStatus.Created
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody User user) {
        user = userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    //(3.4)
    // Deletes User by user's id.
    @DeleteMapping("{userId}")
    public void delete(@PathVariable String userId){
        userService.deleteByUserId(userId);
    }

}
