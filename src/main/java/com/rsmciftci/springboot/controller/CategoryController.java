package com.rsmciftci.springboot.controller;

import com.rsmciftci.springboot.Repository.CategoryRepository;
import com.rsmciftci.springboot.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories/")
public class CategoryController {













    /*
    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping("")
    public ResponseEntity<Object> saveAll(@RequestBody List<Category> categoryList){
        categoryList = categoryRepository.saveAll(categoryList);
        return new ResponseEntity<>(categoryList, HttpStatus.CREATED);
    }

     */
}
