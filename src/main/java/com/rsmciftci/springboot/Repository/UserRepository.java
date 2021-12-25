package com.rsmciftci.springboot.Repository;

import com.rsmciftci.springboot.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
