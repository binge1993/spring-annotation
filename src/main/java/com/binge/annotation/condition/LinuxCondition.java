package com.binge.annotation.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author binge
 * @date 2018年7月24日
 */

public class LinuxCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment environment = context.getEnvironment();
		String osName = environment.getProperty("os.name");
		if (osName.contains("Linux")) {
			return true;
		}

		return false;
	}

}
