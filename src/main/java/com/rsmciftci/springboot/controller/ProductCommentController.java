package com.rsmciftci.springboot.controller;

import com.rsmciftci.springboot.entity.Product;
import com.rsmciftci.springboot.entity.ProductComment;
import com.rsmciftci.springboot.service.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productComments/")
public class ProductCommentController {

    @Autowired
    private ProductCommentService productCommentService;





    @GetMapping({"{productCommentId}"})
    public ProductComment findById(@PathVariable String productCommentId){
        return productCommentService.findById(productCommentId);
    }


    @GetMapping("")
    public List<ProductComment> findAll(){
        return productCommentService.findAll();
    }

    @PostMapping ("")
    public ResponseEntity<Object> save(@RequestBody ProductComment productComment){
        productComment = productCommentService.save(productComment);
        return  new ResponseEntity<>(productComment, HttpStatus.CREATED);
    }

    @DeleteMapping("")
    public void delete(@RequestBody ProductComment productComment){
        productCommentService.delete(productComment);
    }







/*
    @Autowired
    private ProductCommentRepository productCommentRepository;

    @PostMapping("")
    public ResponseEntity<Object> saveAll(@RequestBody List<ProductComment> productCommentList){
        for(ProductComment productComment : productCommentList){
            Date currentDate = new Date();
            productComment.setCommentDate(currentDate);
        }
        productCommentList = productCommentRepository.saveAll(productCommentList);
        return new ResponseEntity<>(productCommentList, HttpStatus.CREATED);
    }

 */
}

