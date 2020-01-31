package com.mystore.mapper;

import com.mystore.entity.PurchaseRecordPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by FireCode on 2020/1/23.
 */
@Mapper
public interface PurchaseRecordMapper {
    public  int insertPurchaseRecord(PurchaseRecordPo po);
}
