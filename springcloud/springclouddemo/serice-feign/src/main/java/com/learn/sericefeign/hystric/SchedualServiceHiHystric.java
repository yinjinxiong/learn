package com.learn.sericefeign.hystric;

import com.learn.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author yinjinquan
 * @version v0.0.1
 * @description 测试断路器处理类
 * @create 2019-02-12 10:24
 * @copyright com.learn
 * @modify yinjinquan
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
