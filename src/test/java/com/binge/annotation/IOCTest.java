package com.binge.annotation;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.binge.annotation.bean.Person;
import com.binge.annotation.config.MainConfig;

/**
 * 
 * @author binge
 * @date 2018年7月24日
 */

public class IOCTest {

	private ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

	@Test
	public void testImport() {
		printBeanNames();
	}

	private void printBeanNames() {
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
	}

	@Test
	public void test() {
		Environment environment = context.getEnvironment();
		String osName = environment.getProperty("os.name");
		System.out.println("osName:" + osName);

		String[] beanNamesForType = context.getBeanNamesForType(Person.class);
		for (String name : beanNamesForType) {
			System.out.println(name);
		}

		Map<String, Person> persons = context.getBeansOfType(Person.class);
		System.out.println(persons);
	}
}
