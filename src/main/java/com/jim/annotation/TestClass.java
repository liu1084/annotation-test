package com.jim.annotation;

/**
 * Created by jim on 2017/5/26.
 * This class is ...
 */
@ClassAnnotation(name = "class name")
public class TestClass {
	@FieldAnnotation(fieldName = "field name")
	public String testField;

	@MethodAnnotation(methodName = "set test field")
	public void setTestField(@ParamAnnotation(parameterName = "1") String p) {
		this.testField = p;
	}
}
