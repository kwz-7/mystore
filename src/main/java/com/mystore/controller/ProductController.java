package com.mystore.controller;

import com.mystore.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by FireCode on 2020/1/23.
 */
@Controller
public class ProductController {
       @Autowired
    private PurchaseService purchaseService=null;

       @GetMapping("/model")
    public ModelAndView index(){
           System.out.println("请求到达");
           return  new ModelAndView("index");
       }
    @GetMapping("/index")
    public String stringIndex(){
        System.out.println("请求到达");
        return  "index";
    }
     @PostMapping("/purchase")
    public String purchase(Long userId, Long productId, Integer quantity){
         boolean purchase = purchaseService.purchase(userId, productId, quantity);
         String retrunMessag=purchase? "抢购成功":"抢购失败";
         return  retrunMessag;
     }

}
