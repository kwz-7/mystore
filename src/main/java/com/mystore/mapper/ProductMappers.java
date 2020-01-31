package com.mystore.mapper;

import com.mystore.entity.ProductPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by FireCode on 2020/1/23.
 */
@Mapper
public interface ProductMappers {
    public ProductPo getProduct(Long id);
    public void decreaseProduct(int QUANTITY, Long ID);
}
