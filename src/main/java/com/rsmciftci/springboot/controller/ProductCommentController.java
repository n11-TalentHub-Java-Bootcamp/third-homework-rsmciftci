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

    // (3.1)
    // Finds all productComments and returns them.
    @GetMapping("")
    public List<ProductComment> findAll(){
        return productCommentService.findAll();
    }

    // (3.2)
    // Finds productComment by it's id.
    @GetMapping({"{productCommentId}"})
    public ProductComment findById(@PathVariable String productCommentId){
        return productCommentService.findById(productCommentId);
    }

    // (3.3)
    // Saves ProductComment and returns productComment& HttpStatus.Created
    @PostMapping ("")
    public ResponseEntity<Object> save(@RequestBody ProductComment productComment){
        productComment = productCommentService.save(productComment);
        return  new ResponseEntity<>(productComment, HttpStatus.CREATED);
    }

    // (3.4)
    // Deletes productCommeny by it's id.
    @DeleteMapping("{productCommentId}")
    public void deleteByProductCommentId(@PathVariable String productCommentId){
        productCommentService.deleteByProductCommentId(productCommentId);
    }


}

