package com.binge.annotation.bean;

import org.springframework.stereotype.Component;

/**
 * @author binge
 * @date 2018年7月26日
 */
@Component
public class Pig {

	private String name;
	private int age;

	public Pig(Car car, Cat cat) {
		System.out.println("car ... cat");
	}

//	public Pig(Car car) {
//		System.out.println("car");
//	}

}
