package com.huawei.cloudproviderpayment8002.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.huawei.cloudconsumerorder80.entities.CommonResult;
import com.huawei.cloudconsumerorder80.entities.Payment;
import com.huawei.cloudproviderpayment8002.service.PaymentService;

/**
 * @author WangZiHao
 * @date 2023/03/23
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("***插入结果: " + result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功,serverPort:"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentByID(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentByID(id);
        log.info("***查询结果: " + payment + "哈哈哈");
//        int i = 1/0;
        if (payment != null){
            return new CommonResult(200,"查询数据库成功,serverPort:"+serverPort,payment);
        }else {
            return new CommonResult(444,"查询数据库失败,查询ID为"+id,null);
        }
    }

}
