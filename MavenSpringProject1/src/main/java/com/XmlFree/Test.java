package com.XmlFree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
//		Example ex=con.getBean("example",Example.class);
		//configuration using bean annotation.
		Example ex=con.getBean("getExample",Example.class);
		System.out.println(ex);
	}
}
