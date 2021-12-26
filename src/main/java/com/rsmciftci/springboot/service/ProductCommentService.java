package com.rsmciftci.springboot.service;

import com.rsmciftci.springboot.Repository.ProductCommentRepository;
import com.rsmciftci.springboot.entity.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductCommentService {

    @Autowired
    private ProductCommentRepository productCommentRepository;
   /* @Autowired
    private UserService userService;
*/
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
    //@Transactional
    public ProductComment save(ProductComment productComment ){

        //String productId = productComment.getProductId();
        //String userId = productComment.getUserId();

        productComment.setCommentDate(new Date());

        productComment = productCommentRepository.save(productComment);
        //userService.updateUserProductCommentSetBeforeSaveProductComment(userId,productId);

        return productComment;

    }


    public void deleteByProductCommentId(String productCommentId){
        productCommentRepository.deleteById(productCommentId);
    }
}
