package com.example.demo.controller;

import com.example.demo.registerbean.Person;
import com.example.demo.utils.ContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private  ContextUtils contextUtils;

    @RequestMapping("/person")
    public String login(){

        Person person = ContextUtils.getBean("person");
        //person.setName("张三");
        // 如果我们不再赋值，那么我们得到的返回值的属性为null, 但是我们在注册bean的时候已经添加了对应的属性
        //值， 为什么不能得到呢？

        AnnotationConfigServletWebServerApplicationContext context = (AnnotationConfigServletWebServerApplicationContext) ContextUtils.getApplicationContext();
        BeanDefinition beanDefinition = context.getBeanDefinition("person");
        //获取BeanDefinition, 我们还是可以得到注册bean时候的属性值的。

        return person.speak();
    }

    @RequestMapping("/person1")
    public String person1(){

        Person person = ContextUtils.getBean("person1");
        //person.setName("张三");

        return person.speak();
    }
}
