package com.mystore.service.impl;

import com.mystore.entity.ProductPo;
import com.mystore.mapper.ProductMappers;
import com.mystore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FireCode on 2020/1/31.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMappers productMappers;
    @Override
    public ProductPo getByProductId(Long productId) {
        return productMappers.getProduct(productId);
    }

    @Override
    @Transactional
    public void insertProduct(ProductPo po) {
        productMappers.insertProduct(po);
    }
    @Override
    public List<ProductPo> getByProductPo(ProductPo productPo){
        return productMappers.getByProductPo(productPo);
    }
    @Override
    public List<ProductPo> getByProductIds(ProductPo productPo){
        return productMappers.getByProductIds(productPo);
    }
    @Override
    public List<ProductPo> getProductByList(ArrayList<Long> ids){
           return productMappers.getProductByList(ids);
    }
    @Override
    public List<ProductPo> getProductByArray(Long[] ids){
        return  productMappers.getProductByArray(ids);
    }

}
