package com.rsmciftci.springboot.Repository.Interfaces;

import com.rsmciftci.springboot.entity.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCommentRepositoryInterface extends MongoRepository<ProductComment, String> {
}
