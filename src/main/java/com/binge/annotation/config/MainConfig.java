package com.binge.annotation.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.binge.annotation.bean.Person;

/**
 * 
 * @author binge
 * @date 2018年7月24日
 */
@Configuration
@ComponentScan(value = "com.binge", useDefaultFilters = false, excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, classes = { Controller.class }) })
public class MainConfig {

	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean
	@Lazy
	public Person person() {
		return new Person("binge", 25);
	}
}
