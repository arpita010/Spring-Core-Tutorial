package com.expressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/expressionLanguage/elConfig.xml");
//		Answer ans=con.getBean("obj",Answer.class);
//		System.out.println(ans);
		
		// spelExpression
//		SpelExpressionParser parser=new SpelExpressionParser();
//		Expression expression=parser.parseExpression("22+19");
//		System.out.println(expression.getValue());
		StaticMethod staticMethod=con.getBean("obj1",StaticMethod.class);
		System.out.println(staticMethod);
	}
}
