package com.chtm.myself.web;
/**
 * Created by snail on 17-6-20.
 */

import com.chtm.myself.interfaces.MyInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther cht
 * @create 2017-06-{DAY}-下午3:11
 * @
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private MyInfoService myInfoService;

    @RequestMapping("/test")
    public String Test(){
        System.out.println("test...................................");
        return "hello world";
    }




}
