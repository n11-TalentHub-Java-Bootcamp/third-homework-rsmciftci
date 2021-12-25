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

    public List<User>  findAll(){
        return userRepository.findAll();
    }

    public User findById(String userId){
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = null;
        if(optionalUser.isPresent()){
            user = optionalUser.get();
        }
        return user;
    }
    public User save(User user){
        return userRepository.save(user);
    }
    public void delete(User user){
        userRepository.delete(user);
    }



}
