package com.mystore.service;

import org.springframework.stereotype.Service;

/**
 * Created by FireCode on 2020/1/23.
 */
@Service
public interface PurchaseService {
    /*处理购买业务
    * 用户编号
    * 产品编号
    * 购买数量
    * */
    public  boolean purchase(Long userId, Long productId, int quantity);


}
