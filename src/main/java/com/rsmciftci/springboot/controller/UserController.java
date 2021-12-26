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
//
    @Autowired
    private UserService userService;

    // (3.1)
    @GetMapping("")
    public List<User> findAll(){
        return userService.findAll();
    }
    // (3.2)
    @GetMapping({"{userId}"})
    public User findById(@PathVariable String userId){
        return userService.findById(userId);
    }

    //(3.3)
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody User user) {

        user = userService.save(user);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    //(3.4)
    @DeleteMapping("{userId}")
    public void delete(@PathVariable String userId){
        userService.deleteByUserId(userId);
    }
/*
    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody User user){
        user = userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping("saveAll")
    public ResponseEntity<Object> saveAll(@RequestBody List<User> userList){
        userList = userRepository.saveAll(userList);
        return new ResponseEntity<>(userList, HttpStatus.CREATED);
    }

 */
}
