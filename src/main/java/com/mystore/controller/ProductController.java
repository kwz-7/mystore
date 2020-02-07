package com.mystore.controller;

import com.mystore.entity.Account;
import com.mystore.entity.ProductPo;
import com.mystore.entity.User;
import com.mystore.service.*;
import com.mystore.service.impl.UserServiceImpl;
import com.rabbitmq.tools.json.JSONUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by FireCode on 2020/1/23.
 */
@RestController
public class ProductController {
       @Autowired
    private PurchaseService purchaseService=null;
     @Autowired
     private ProductService productService=null;
     @Autowired
     private UserService userService=null;
     @Autowired
     private AccountService accountService=null;
     @Autowired
     private RoleService roleService=null;
     @Autowired
     private SqlSession sqlSession=null;
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
     @GetMapping("/getByProductPo")
    public String insertProduct(){
         ProductPo productPo = new ProductPo();
         productPo.setPrice(1000);
         productPo.setProductName("羽绒服");
         productPo.setStock(300);
         productPo.setNote("鹅绒");
         List<ProductPo> byProductPo = productService.getByProductPo(productPo);
         System.out.println(productPo.getId());
         return byProductPo.toString();
     }
    @GetMapping("/getByProductId")
    public String insertProductIds(){
        ProductPo productPo = new ProductPo();
        ArrayList<Long> ids = new ArrayList<>();
        ids.add(1240L);
        ids.add(1240L);
        productPo.setIds(ids);
        productPo.setPrice(1000);
        productPo.setProductName("羽绒服");
        productPo.setStock(300);
        productPo.setNote("鹅绒");

        List<ProductPo> byProductPo = productService.getByProductIds(productPo);
        System.out.println(productPo.getId());
        return byProductPo.toString();
    }
    @GetMapping("/getProductByList")
    public String insertProductList(){
        ArrayList<Long> ids = new ArrayList<>();
        ids.add(1240L);
        ids.add(1241L);


        List<ProductPo> byProductPo = productService.getProductByList(ids);
        return byProductPo.toString();
    }
    @GetMapping("/getProductByArray")
    public String insertProductArray(){
      Long [] ids= new Long[2];

        ids[0]=1240L;
        ids[1]=1241L;

        List<ProductPo> byProductPo = productService.getProductByArray(ids);
        return byProductPo.toString();
    }
    @GetMapping("/getUserByUserName/{userName}")
    public String getUserByUserName(@PathVariable("userName") String userName){
        return userService.getByUserNmae(userName).toString();
    }


    @GetMapping("/getUserByAccountId/{uId}")
    public String getUserByAccountId(@PathVariable("uId") Integer uId){
        return accountService.getByUid(uId).toString();
    }
    @GetMapping("/getUserAccount/{userName}")
    public String getUserAccount(@PathVariable("userName") String uId){
        return userService.getUserAccount(uId).toString();
    }


    @GetMapping("/getRoleAll}")
    public String getRoleAll(){
        return roleService.getRoleAll().toString();
    }


    @GetMapping("/getAllAccounts")
    public String getAllAccounts(){
        return  accountService.getAllAccounts().toString();
    }
    @GetMapping("/getUser")
    public String getUser(){
          User nmae= userService.getByUserNmae("张三");
          User nmae1= userService.getByUserNmae("张三");
           System.out.println(nmae==nmae1);
          return  "成功";
    }

}
