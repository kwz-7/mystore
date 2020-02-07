package com.mystore.controller;

import com.mystore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FireCode on 2020/1/30.
 */
@RestController
public class IndexController {
    @Autowired
    private ProductService productService;
   @GetMapping("hello")
    public String  test(){
       return "Hello!";
   }
    @GetMapping("hello/{id}")
    public String  getProductById(@PathVariable("id")Long productId){
        return productService.getByProductId(productId).getProductName();
    }
}
