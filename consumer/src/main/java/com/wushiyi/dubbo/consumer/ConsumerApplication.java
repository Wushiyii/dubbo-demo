package com.wushiyi.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
        MessageConsumer consumer = (MessageConsumer) context.getBean("messageConsumer");
        consumer.sendMsg("123");
    }

}

