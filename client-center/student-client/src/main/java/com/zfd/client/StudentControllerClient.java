package com.zfd.client;
import com.zfd.hystrix.StudentControllerClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "student-center", fallback = StudentControllerClientHystrix.class)
public interface StudentControllerClient {

    @PostMapping("studentController/findDelayProduct")
    String findDelayProduct(@RequestParam("name") String name);
}
