package com.constructor.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/constructor/injection/constructor_injection_config.xml");
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);
		
		Addition add = (Addition) context.getBean("add");
		add.sum();
		
		context.close();
	}

}
