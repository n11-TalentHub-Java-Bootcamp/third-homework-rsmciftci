package com.rsmciftci.springboot.service;

import com.rsmciftci.springboot.Repository.Interfaces.ProductCommentRepositoryInterface;
import com.rsmciftci.springboot.entity.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service

public class ProductCommentService {

    @Autowired
    private ProductCommentRepositoryInterface productCommentRepositoryInterface;
    @Autowired
    private UserService userService;

    public List<ProductComment> findAll(){
        return productCommentRepositoryInterface.findAll();
    }

    public ProductComment findById(String productCommentID){
        Optional<ProductComment> optionalProductComment = productCommentRepositoryInterface.findById(productCommentID);
        ProductComment productComment = null;
        if(optionalProductComment.isPresent()){
            productComment = optionalProductComment.get();
        }
        return productComment;
    }
    @Transactional
    public ProductComment save(ProductComment productComment ){

        String productId = productComment.getProductId();
        String userId = productComment.getUserId();

        productComment.setCommentDate(new Date());

        productComment = productCommentRepositoryInterface.save(productComment);
        userService.updateUserProductCommentSetBeforeSaveProductComment(userId,productId);

        return productComment;

    }



    public void delete(ProductComment productComment){
        productCommentRepositoryInterface.delete(productComment);
    }
}
