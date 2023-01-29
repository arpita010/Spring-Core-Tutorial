package com.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * we use standalone collection so that we can use same collection multiple times.
 * it reduce length of the code;
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/standalone/collection/standaloneConfig.xml");
		Course c=context.getBean("c1",Course.class);
		System.out.println(c);
	}
}
