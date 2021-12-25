package com.rsmciftci.springboot.controller;

import com.rsmciftci.springboot.entity.ProductComment;
import com.rsmciftci.springboot.service.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
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
