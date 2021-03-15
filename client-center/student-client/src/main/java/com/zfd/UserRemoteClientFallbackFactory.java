package com.zfd;

import com.zfd.client.StudentControllerClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserRemoteClientFallbackFactory implements FallbackFactory<StudentControllerClient> {
    private Logger logger = LoggerFactory.getLogger(UserRemoteClientFallbackFactory.class);
    @Override
    public StudentControllerClient create(final Throwable cause) {
        logger.error("UserRemoteClient回退：", cause);
        return (name) -> "";
    }
}