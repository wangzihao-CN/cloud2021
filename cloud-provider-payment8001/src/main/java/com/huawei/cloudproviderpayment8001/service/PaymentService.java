package com.huawei.cloudproviderpayment8001.service;

import com.huawei.cloudconsumerorder80.entities.Payment;

/**
 * @author WangZiHao
 * @date 2023/03/23
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentByID(Long id);
//    Payment getPaymentByID(@Param("id") Long id);
}
