package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.cloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
