package com.atguigu.springcloud.service;

import com.cloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Integer id);
}
