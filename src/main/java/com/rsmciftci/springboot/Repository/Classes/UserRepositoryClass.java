package com.rsmciftci.springboot.Repository.Classes;

import com.rsmciftci.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class UserRepositoryClass {
    @Autowired
    private MongoOperations mongoOperations;

    public User updateUserProductCommentSetBeforeSaveProductComment(String userId, String productCommentId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(userId));

        Update update = new Update();
        update.addToSet("productCommentIds",productCommentId);
        User user = mongoOperations.findAndModify(query, update,
                new FindAndModifyOptions().returnNew(true), User.class);
        return user;
    }
}