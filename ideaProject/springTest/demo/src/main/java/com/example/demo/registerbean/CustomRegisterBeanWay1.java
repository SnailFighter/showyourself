package com.example.demo.registerbean;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;

public class CustomRegisterBeanWay1 {

    public void registerBean(ApplicationContext context){
        AnnotationConfigServletWebServerApplicationContext beanFactory = (AnnotationConfigServletWebServerApplicationContext)context;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Person.class);
        beanDefinition.setAttribute("name","张老三");

        beanFactory.registerBeanDefinition("person",beanDefinition);

    }


}
