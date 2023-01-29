package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * we can use autowiring by xml or annotation.
 * @Autowired annotation is used.
 * autowiring can have these values - no or byName or byType or constructor or autodetect(autodetect option is deprecated now)
 */


public class Testing {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowiring/autowireConfig.xml");
		Parent p=(Parent)context.getBean("parent");
		Child c=(Child)context.getBean("child");
		System.out.println(p);
		System.out.println(c);
		
		
	}
}
