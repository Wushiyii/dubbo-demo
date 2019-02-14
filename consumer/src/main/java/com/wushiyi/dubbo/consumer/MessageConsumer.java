package com.wushiyi.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wushiyi.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @Reference(interfaceClass = ServiceAPI.class)
    private ServiceAPI serviceAPI;

    public void sendMsg(String msg) {
        String s = serviceAPI.sendMessage(msg);
        System.out.println(s);
    }
}
