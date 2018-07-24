package com.binge.annotation.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author binge
 * @date 2018年7月24日
 */

public class MyImportSelector implements ImportSelector {

	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[] { "com.binge.annotation.bean.Blue", "com.binge.annotation.bean.Yellow" };
	}

}
