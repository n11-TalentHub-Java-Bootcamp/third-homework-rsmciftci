package com.rsmciftci.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
