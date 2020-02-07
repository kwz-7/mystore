package com.mystore.service.impl;


import com.mystore.entity.ProductPo;
import com.mystore.entity.PurchaseRecordPo;
import com.mystore.mapper.ProductMappers;
import com.mystore.mapper.PurchaseRecordMapper;
import com.mystore.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by FireCode on 2020/1/23.
 */
@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private ProductMappers productMappers;
    @Autowired
    private PurchaseRecordMapper purchaseRecordMapper;
    @Override
    @Transactional
    public boolean purchase(Long userId, Long productId, int quantity) {
        //获取产品
        ProductPo productpo= productMappers.getProduct(productId);
        //比较库存和购买数量
        if(productpo.getStock()<quantity){
            return false;
        }
        int version=productpo.getVersion();
      //扣减库存
       int result= productMappers.decreaseProduct(quantity,productId,version);
        if (result !=1)
        {
            System.out.println("更新失败了");
            return false;
        }
        //初始化购买信息
        PurchaseRecordPo po = initPurchaseRecord(userId, productpo, quantity);
        //插入购买记录
        purchaseRecordMapper.insertPurchaseRecord(po);
        System.out.println("插入记录成功");
        return true;
    }
    //初始化购买信息
    private PurchaseRecordPo initPurchaseRecord(Long userId,ProductPo productPo,int quantity){
        PurchaseRecordPo purchaseRecordPo = new PurchaseRecordPo();
        purchaseRecordPo.setNote("购买日志,时间："+System.currentTimeMillis());
        purchaseRecordPo.setPrice(productPo.getPrice());
        purchaseRecordPo.setProductId(productPo.getId());
        purchaseRecordPo.setQuantity(quantity);
        double sum=productPo.getPrice()*quantity;
        purchaseRecordPo.setSum(sum);
           purchaseRecordPo.setUserId(userId);
           return purchaseRecordPo;
    }
}
