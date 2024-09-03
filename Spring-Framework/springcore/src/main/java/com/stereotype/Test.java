package com.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/stereotype_config.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		context.close();
	}

}
