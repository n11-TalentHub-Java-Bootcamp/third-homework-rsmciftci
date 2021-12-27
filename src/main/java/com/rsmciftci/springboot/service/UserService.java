package com.rsmciftci.springboot.service;


import com.rsmciftci.springboot.Repository.UserRepository;
import com.rsmciftci.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Finds all user by userRepository and return it
    public List<User>  findAll(){
        return userRepository.findAll();
    }

    // Finds user by user's id and returns it if any user matches with userId.
    public User findById(String userId){
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = null;
        if(optionalUser.isPresent()){
            user = optionalUser.get();
        }
        return user;
    }

    // Saves user
    public User save(User user){ return userRepository.save(user); }

    // Deletes user by user's id.
    public void deleteByUserId(String userId){
        userRepository.deleteById(userId);
    }









}
