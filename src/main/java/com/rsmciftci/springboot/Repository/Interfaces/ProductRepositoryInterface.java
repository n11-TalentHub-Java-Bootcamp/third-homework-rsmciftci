package com.rsmciftci.springboot.Repository.Interfaces;

import com.rsmciftci.springboot.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepositoryInterface extends MongoRepository<Product, String> {
}
