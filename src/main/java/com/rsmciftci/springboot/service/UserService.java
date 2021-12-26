package com.rsmciftci.springboot.service;

import com.rsmciftci.springboot.Repository.Classes.UserRepositoryClass;
import com.rsmciftci.springboot.Repository.Interfaces.UserRepositoryInterface;
import com.rsmciftci.springboot.entity.User;
import com.rsmciftci.springboot.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepositoryInterface userRepositoryInterface;
    @Autowired
    private UserRepositoryClass userRepositoryClass;



    public List<User>  findAll(){
        return userRepositoryInterface.findAll();
    }

    public User findById(String userId){
        Optional<User> optionalUser = userRepositoryInterface.findById(userId);
        User user = null;
        if(optionalUser.isPresent()){
            user = optionalUser.get();
        }
        return user;
    }
    public User save(User user){
        return userRepositoryInterface.save(user);
    }
    public void delete(User user){
        userRepositoryInterface.delete(user);
    }

    @Transactional()
    public User updateUserProductCommentSetBeforeSaveProductComment(String userId, String productCommentId){

         User user = userRepositoryClass.updateUserProductCommentSetBeforeSaveProductComment(userId,productCommentId);
         if (user == null) throw new UserNotFoundException("Unable to find user with user.id :" + userId);

        return user;
    }









}
