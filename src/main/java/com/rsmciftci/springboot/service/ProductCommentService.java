package com.rsmciftci.springboot.service;

import com.rsmciftci.springboot.Repository.ProductCommentRepository;
import com.rsmciftci.springboot.entity.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductCommentService {

    @Autowired
    private ProductCommentRepository productCommentRepository;

    // Finds all ProductComments and returns as a List
    public List<ProductComment> findAll(){
        return productCommentRepository.findAll();
    }

    // Finds productComment by it's id. Returns null if id doesn't match with any productComment.
    public ProductComment findById(String productCommentID){
        Optional<ProductComment> optionalProductComment = productCommentRepository.findById(productCommentID);
        ProductComment productComment = null;
        if(optionalProductComment.isPresent()){
            productComment = optionalProductComment.get();
        }
        return productComment;
    }
    // Saves productComment
    public ProductComment save(ProductComment productComment ){

        if(productComment.getCommentDate() == null){
            productComment.setCommentDate(new Date());
        }

        productComment = productCommentRepository.save(productComment);
        return productComment;

    }


    public void deleteByProductCommentId(String productCommentId){
        productCommentRepository.deleteById(productCommentId);
    }
}
