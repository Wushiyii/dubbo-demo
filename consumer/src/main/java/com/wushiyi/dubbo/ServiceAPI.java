package com.wushiyi.dubbo;

import org.springframework.stereotype.Component;

@Component
public interface ServiceAPI {

    String sendMessage(String msg);

}
