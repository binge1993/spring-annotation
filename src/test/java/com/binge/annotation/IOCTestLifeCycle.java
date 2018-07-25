package com.binge.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.binge.annotation.config.MainConfigOfLifeCycle;

/**
 * 
 * @author binge
 * @date 2018年7月25日
 */

public class IOCTestLifeCycle {

	@Test
	public void test01() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				MainConfigOfLifeCycle.class);
		System.out.println("容器初始化完成。。");
		context.close();
	}
}
