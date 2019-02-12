package com.learn.sericefeign.service;

import com.learn.sericefeign.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yinjinquan
 * @version v0.0.1
 * @description 测试feign
 * @create 2019-02-11 18:40
 * @copyright com.learn
 * @modify yinjinquan
 **/
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
