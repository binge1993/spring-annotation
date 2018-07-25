package com.binge.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.binge.annotation.bean.Car;
import com.binge.annotation.bean.Cat;
import com.binge.annotation.bean.Dog;
import com.binge.annotation.bean.MyBeanPostProcessor;

/**
 * bean的生命周期： bean创建---初始化---销毁的过程 管理
 * 
 * @author binge
 * @date 2018年7月25日
 */
@Configuration
public class MainConfigOfLifeCycle {

	@Bean(initMethod = "init", destroyMethod = "destory")
	public Car car() {
		return new Car();
	}

	@Bean
	public Cat cat() {
		return new Cat();
	}

	@Bean
	public Dog dog() {
		return new Dog();
	}
	
	@Bean
	public MyBeanPostProcessor myBeanPostProcessor(){
		return new MyBeanPostProcessor();
	}
}
