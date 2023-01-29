package com.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/stereo/stereoConfig.xml");
		Student stu1=con.getBean("stu1",Student.class);
		System.out.println(stu1);
	}
}
