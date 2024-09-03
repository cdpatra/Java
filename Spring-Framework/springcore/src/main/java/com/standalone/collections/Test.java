package com.standalone.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/standalone/collections/standalone_collections_config.xml");
		Person person1 = context.getBean("person1", Person.class);
		System.out.println(person1);
		System.out.println("<<==============================================================================>>");
		System.out.println(person1.getFriends());
		System.out.println("<<==============================================================================>>");
		System.out.println(person1.getFeeStructure());
		System.out.println("<<==============================================================================>>");
		System.out.println(person1.getProperties());
		context.close();
	}

}
