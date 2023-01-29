package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * if you want to use setter injection , then place annotation above setter method of that field.
 * for constructor injection,write annotation on constructor. 
 * qualifier annotation is used for specifying the name of the bean which we want to inject
 */



public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/annotation/annotationConfig.xml");
		Project p1=context.getBean("p1",Project.class);
		Employee e1=context.getBean("e1",Employee.class);
		System.out.println(p1);
		System.out.println(e1);
	}
}
