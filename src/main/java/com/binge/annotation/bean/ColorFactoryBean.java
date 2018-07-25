package com.binge.annotation.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 
 * @author binge
 * @date 2018年7月25日
 */

public class ColorFactoryBean implements FactoryBean<Color> {

	// 返回一个color对象，这个对象会添加到容器中
	public Color getObject() throws Exception {
		return new Color();
	}

	public Class<?> getObjectType() {
		return Color.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
