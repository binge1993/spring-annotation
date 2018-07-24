package com.binge.annotation.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.binge.annotation.bean.Color;
import com.binge.annotation.bean.Person;
import com.binge.annotation.bean.Red;
import com.binge.annotation.condition.LinuxCondition;
import com.binge.annotation.condition.MyImportSelector;
import com.binge.annotation.condition.WindowsCondition;

/**
 * 
 * @author binge
 * @date 2018年7月24日
 */
@Configuration
@ComponentScan(value = "com.binge", useDefaultFilters = false, excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = { Controller.class }) })
@Import({ Color.class, Red.class, MyImportSelector.class })
public class MainConfig {

	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Bean
	@Lazy
	public Person person() {
		return new Person("binge", 25);
	}

	/**
	 * @see 如果是windows则创建bill实例
	 * @see 如果linux则创建linus
	 * 
	 * @return
	 */
	@Conditional({ WindowsCondition.class })
	@Bean("bill")
	public Person person01() {
		return new Person("bill", 62);
	}

	@Conditional({ LinuxCondition.class })
	@Bean("linus")
	public Person person02() {
		return new Person("linus", 58);
	}
}
