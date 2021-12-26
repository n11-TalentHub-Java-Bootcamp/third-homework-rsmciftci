package com.rsmciftci.springboot.Repository;

import com.rsmciftci.springboot.entity.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCommentRepository extends MongoRepository<ProductComment, String> {
}
