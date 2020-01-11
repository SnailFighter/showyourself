package com.example.demo.utils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContextUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public  void setApplicationContext(ApplicationContext context){
        this.context = context;
    }


    public static ApplicationContext getApplicationContext(){
        return context;
    }

    public static <T> T getBean(String name) throws BeansException {
        return (T) context.getBean(name);
    }



}
