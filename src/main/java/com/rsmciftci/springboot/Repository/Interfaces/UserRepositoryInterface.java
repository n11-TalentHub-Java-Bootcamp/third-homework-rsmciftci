package com.rsmciftci.springboot.Repository.Interfaces;
import com.rsmciftci.springboot.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositoryInterface extends MongoRepository<User, String> {



}
