package com.wushiyi.dubbo.provider.starter;

import com.alibaba.dubbo.config.annotation.Service;
import com.wushiyi.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Service(interfaceClass = ServiceAPI.class)
@Component
public class MessageServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String msg) {
        return "provider - " + msg;
    }
}
