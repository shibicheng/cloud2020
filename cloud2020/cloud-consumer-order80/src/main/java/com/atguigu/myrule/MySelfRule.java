package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
/*    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }*/

    @Bean
    public IRule myRule(){
        return new RandomRule_ZY();//定义为访问5次
    }
}