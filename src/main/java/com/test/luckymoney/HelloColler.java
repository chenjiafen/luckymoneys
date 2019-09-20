package com.test.luckymoney;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tyler.chen
 * @data 2019-09-20 23:36
 */
@RestController
public class HelloColler {

//        @RequestMapping(value = "/hello",method = RequestMethod.GET ) //请求接口，且是get方法，旧版本
        @GetMapping("/hello")
        public String say(){
            return "跟慕课老师学习SpringBoot";
        }

}
