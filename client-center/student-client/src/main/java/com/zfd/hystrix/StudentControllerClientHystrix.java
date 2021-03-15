package com.zfd.hystrix;

import com.zfd.client.StudentControllerClient;
import org.springframework.stereotype.Component;

@Component
public class StudentControllerClientHystrix implements StudentControllerClient {
    @Override
    public String findDelayProduct(String name) {
        return "请求失败了呀！！！";
    }
}
