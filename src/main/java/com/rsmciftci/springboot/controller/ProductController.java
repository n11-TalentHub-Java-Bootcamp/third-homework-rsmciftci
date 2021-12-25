package com.rsmciftci.springboot.controller;

import com.rsmciftci.springboot.Repository.ProductRepository;
import com.rsmciftci.springboot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/products/")
public class ProductController {




    /*
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("")
    public ResponseEntity<Object> saveAll(@RequestBody List<Product> productList){
        for(Product product : productList){
            Date currentDate = new Date();
            product.setRegistrationDate(currentDate);
        }
        productList = productRepository.saveAll(productList);
        return new ResponseEntity<>(productList, HttpStatus.CREATED);
    }

     */
}
