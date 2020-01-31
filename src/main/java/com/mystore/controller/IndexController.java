package com.mystore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FireCode on 2020/1/30.
 */
@RestController
public class IndexController {
   @GetMapping("hello")
    public String  test(){
       return "Hello!";
   }
}
