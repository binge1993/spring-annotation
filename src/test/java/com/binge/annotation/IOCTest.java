package com.binge.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.binge.annotation.bean.Person;
import com.binge.annotation.config.MainConfig;

/**
 * 
 * @author binge
 * @date 2018年7月24日
 */

public class IOCTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}

		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
}
