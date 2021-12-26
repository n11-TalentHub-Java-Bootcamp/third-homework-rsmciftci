package com.rsmciftci.springboot.Repository;

import com.rsmciftci.springboot.entity.Category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
