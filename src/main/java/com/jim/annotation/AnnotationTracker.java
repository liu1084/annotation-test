package com.jim.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by jim on 2017/5/26.
 * This class is ...
 */
public class AnnotationTracker {
	private static final Logger LOGGER = LoggerFactory.getLogger(AnnotationTracker.class);

	public static void getClassAnnotation(Class<?> cl) {
		ClassAnnotation annotation = cl.getAnnotation(ClassAnnotation.class);

		if (annotation != null) {
			LOGGER.debug(annotation.name());
		}
	}

	public static void getFieldAnnotation(Class<?> cl) {
		for (Field field : cl.getDeclaredFields()) {
			FieldAnnotation annotation = field.getAnnotation(FieldAnnotation.class);
			if (annotation != null) {
				LOGGER.debug(annotation.fieldName());
			}
		}
	}

	public static void getMethodAnnotation(Class<?> cl) {
		for (Method method : cl.getDeclaredMethods()) {
			MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
			if (annotation != null) {
				LOGGER.debug(annotation.methodName());
			}

			for (Parameter parameter : method.getParameters()) {
				ParamAnnotation paramAnnotation = parameter.getAnnotation(ParamAnnotation.class);
				if (paramAnnotation != null) {
					LOGGER.debug(paramAnnotation.parameterName());
				}
			}
		}
	}
}
