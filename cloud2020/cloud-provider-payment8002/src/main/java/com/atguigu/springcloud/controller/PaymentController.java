package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.service.PaymentService;
import com.cloud.entities.CommonResult;
import com.cloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result=paymentService.create(payment);
        System.out.println("*****"+result);
        if(result>0){
            return  new CommonResult(200,"插入数据成功,serverPort"+serverPort,result);
        }else{
            return  new CommonResult(200,"插入数据失败,serverPort"+serverPort,null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult create(@PathVariable("id") int id){
        Payment payment=paymentService.getPaymentById(id);
        System.out.println("*****"+payment);
        if(payment!=null){
            return  new CommonResult(200,"查询成功,serverPort"+serverPort,payment);
        }else{
            return  new CommonResult(200,"查询失败,serverPort"+serverPort,null);
        }
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
