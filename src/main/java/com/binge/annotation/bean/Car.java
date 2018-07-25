package com.binge.annotation.bean;

/**
 * 
 * @author binge
 * @date 2018年7月25日
 */

public class Car {

	public Car() {
		System.out.println("car ... construct...");
	}

	public void init() {
		System.out.println("car ... init ... ");
	}

	public void destory() {
		System.out.println("car ... destory ... ");
	}
}
