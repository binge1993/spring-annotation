package com.binge.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 
 * @author binge
 * @date 2018年7月25日
 */

public class Dog {

	public Dog() {
		System.out.println("dog constructor ... ");
	}

	// bean创建完并配置完属性
	@PostConstruct
	public void init() {
		System.out.println("Dog ... @PostConstruct...");
	}

	@PreDestroy
	public void destory() {
		System.out.println("Dog ... @PreDestroy...");
	}
}
