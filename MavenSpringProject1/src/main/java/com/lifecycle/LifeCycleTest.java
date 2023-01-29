package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/lifecycleConfig.xml");
		/*
		 * two methods are there : init() and destroy() Lifecycle configuration
		 * techniques 1. using xml 2. using spring interfaces 3.using annotations we can
		 * change the name of these methods as per our convenience
		 * destroy() method will not call automatically
		 * for calling it , we must enable hook on context object
		 * we have to use abstractapplicationcontext for this
		 */
		context.registerShutdownHook();
		Food f1 = (Food) context.getBean("f1");
		Food f2 = (Food) context.getBean("f2");
		Food f3 = (Food) context.getBean("f3");
		Food f4 = (Food) context.getBean("f4");
		System.out.println("Food objects .....");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println("++++++++++++++++++++++++++++++");
		Person p1 = (Person) context.getBean("p1");
		Person p2 = (Person) context.getBean("p2");
		Person p3 = (Person) context.getBean("p3");
		Person p4 = (Person) context.getBean("p4");
		System.out.println("Person objects .....");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}
}
