package com.assignment.task1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task_1 {

	public static void main(String[] args) {
		
		//start IocContainer
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		JavaLanguage lang = context.getBean("Framework",JavaLanguage.class );
		
		System.out.println(lang.learningJava());
		System.out.println(lang.learningPython());
		
		context.close();

	}

}
