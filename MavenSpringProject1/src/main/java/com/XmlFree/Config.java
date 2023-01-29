package com.XmlFree;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.XmlFree")
public class Config {
	@Bean
//	@Bean(name= {"arpita","temp"}) // explicitly defining names for new objects.
	public Example getExample() {
		Example ex = new Example();
		ex.setX(1000);
		ex.setName("Arpita Mittal");
		return ex;
	}
}
