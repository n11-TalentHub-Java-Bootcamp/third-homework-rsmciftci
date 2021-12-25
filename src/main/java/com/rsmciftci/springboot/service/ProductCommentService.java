package com.rsmciftci.springboot.service;

import com.rsmciftci.springboot.Repository.ProductCommentRepository;
import com.rsmciftci.springboot.entity.ProductComment;
import com.rsmciftci.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductCommentService {

    @Autowired
    private ProductCommentRepository productCommentRepository;

    public List<ProductComment> findAll(){
        return productCommentRepository.findAll();
    }

    public ProductComment findById(String productCommentID){
        Optional<ProductComment> optionalProductComment = productCommentRepository.findById(productCommentID);
        ProductComment productComment = null;
        if(optionalProductComment.isPresent()){
            productComment = optionalProductComment.get();
        }
        return productComment;
    }
    public ProductComment save(ProductComment productComment ){
        return productCommentRepository.save(productComment);
    }
    public void delete(ProductComment productComment){
        productCommentRepository.delete(productComment);
    }
}
