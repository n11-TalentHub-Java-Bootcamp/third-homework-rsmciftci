package com.rsmciftci.springboot.Repository.Interfaces;

import com.rsmciftci.springboot.entity.Category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepositoryInterface extends MongoRepository<Category, String> {
}
