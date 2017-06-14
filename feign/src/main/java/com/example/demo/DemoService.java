package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lining on 17/5/21.
 */
@FeignClient("compute-service")
public interface DemoService {

@RequestMapping(method = RequestMethod.GET, value = "/add")
Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}

