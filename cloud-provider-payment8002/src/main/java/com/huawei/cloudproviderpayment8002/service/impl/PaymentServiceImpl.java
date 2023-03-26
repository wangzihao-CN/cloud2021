package com.huawei.cloudproviderpayment8002.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.huawei.cloudconsumerorder80.entities.Payment;
import com.huawei.cloudproviderpayment8002.dao.PaymentDao;
import com.huawei.cloudproviderpayment8002.service.PaymentService;

/**
 * @author WangZiHao
 * @date 2023/03/23
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentByID(Long id) {
        return paymentDao.getPaymentByID(id);
    }
}
