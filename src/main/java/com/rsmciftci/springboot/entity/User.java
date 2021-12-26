package com.rsmciftci.springboot.entity;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Document(collection = "user")
public class User  {


    @Id
    private String id;

    private String name;
    private String surname;


    @Indexed(unique = true)
    private String email;

    private String phoneNumber;
    private Set<String> productCommentIds;
    private String username;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<String> getProductCommentIds() {
        return productCommentIds;
    }

    public void setProductCommentIds(Set<String> productCommentIds) {
        this.productCommentIds = productCommentIds;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
