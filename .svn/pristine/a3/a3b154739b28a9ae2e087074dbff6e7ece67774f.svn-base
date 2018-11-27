package com.myehr.common.util;

public class Test {
	private static final Class<?> LocationAwareLogger = null;

	public static void main(String[] args) {
		getClassResource(LocationAwareLogger);
		
	}
	
	public static String getClassResource(Class<?> klass) {
		return klass.getClassLoader().getResource(
             klass.getName().replace('.', '/') + ".class").toString();
	}

}
