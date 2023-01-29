package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
	public static void main(String[] args)
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/lifecycle/annotationConfig.xml");
		context.registerShutdownHook();
		Product p1=(Product)context.getBean("p1");
		Product p2=(Product)context.getBean("p2");
		System.out.println(p1);
		System.out.println(p2);
	
	
	
	
	}
}
