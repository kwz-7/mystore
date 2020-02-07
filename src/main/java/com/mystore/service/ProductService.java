package com.mystore.service;

import com.mystore.entity.ProductPo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FireCode on 2020/1/31.
 */
public interface ProductService {
       public ProductPo getByProductId(Long productId);
       public void insertProduct(ProductPo po);
       public List<ProductPo> getByProductPo(ProductPo productPo);
       public List<ProductPo> getByProductIds(ProductPo productPo);
       public List<ProductPo> getProductByList(ArrayList<Long> ids);
       public List<ProductPo> getProductByArray(Long[] ids);
}
