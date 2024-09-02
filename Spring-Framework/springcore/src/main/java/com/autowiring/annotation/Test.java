package com.autowiring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/annotation/autowiring_annotation_config.xml");
		Employee emp1 = context.getBean("emp1", Employee.class);
		System.out.println(emp1);
		context.close();
	}

}
