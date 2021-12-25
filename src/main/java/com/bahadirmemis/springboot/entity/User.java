package com.bahadirmemis.springboot.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Document(collection = "user")
public class User  {


    @Id
    private String id;

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private List<ProductComment> productComments;
    private String userName;


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

    public List<ProductComment> getProductComments() {
        return productComments;
    }

    public void setProductComments(List<ProductComment> productComments) {
        this.productComments = productComments;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
