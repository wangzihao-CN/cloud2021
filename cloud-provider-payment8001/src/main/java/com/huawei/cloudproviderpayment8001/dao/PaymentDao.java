package com.huawei.cloudproviderpayment8001.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.huawei.cloudconsumerorder80.entities.Payment;

/**
 * @author WangZiHao
 * @date 2023/03/23
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentByID(@Param("id") Long id);
}
