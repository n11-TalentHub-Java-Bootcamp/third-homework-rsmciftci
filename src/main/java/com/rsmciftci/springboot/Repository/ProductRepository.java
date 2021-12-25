package com.rsmciftci.springboot.Repository;

import com.rsmciftci.springboot.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
