package com.example.demo;

import com.example.demo.registerbean.CustomRegisterBeanWay1;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = run(DemoApplication.class, args);

		CustomRegisterBeanWay1 customRegisterBean = new CustomRegisterBeanWay1();

		customRegisterBean.registerBean(context);


	}



}
