package com.mystore.mapper;

import com.mystore.entity.ProductPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FireCode on 2020/1/23.
 */
@Repository
public interface ProductMappers {
    public ProductPo getProduct(Long id);
    public int decreaseProduct(@Param("QUANTITY") int QUANTITY, @Param("ID") Long ID,@Param("version") int version);
    public void insertProduct(ProductPo po);
    public List<ProductPo> getByProductPo(ProductPo productPo);
    public List<ProductPo> getByProductIds(ProductPo productPo);
    public List<ProductPo> getProductByList(ArrayList<Long> ids);
    public List<ProductPo> getProductByArray(Long[] ids);
}
