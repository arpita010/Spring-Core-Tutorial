package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionConfig.xml");
		//projects
		Project p1 = (Project) context.getBean("p1");
		Project p2 = (Project) context.getBean("p2");
		Project p3 = (Project) context.getBean("p3");
		Project p4 = (Project) context.getBean("p4");
		Project p5 = (Project) context.getBean("p5");
		Project p6 = (Project) context.getBean("p6");
	
		//employees
		Employee e1=(Employee)context.getBean("e1");
		Employee e2=(Employee)context.getBean("e2");
		Employee e3=(Employee)context.getBean("e3");
		Employee e4=(Employee)context.getBean("e4");
		
		//departments 
		Department d1=(Department)context.getBean("d1");

		Department d2=(Department)context.getBean("d2");
		System.out.println("Various projects");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Employees objects ");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println("++++++++++++++++++++++++++++++++++++++====");
		System.out.println("Department objects");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("++++++++++++++");
	
	
	
	
	}
}
