package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/samosa_config.xml");
		context.registerShutdownHook(); // registerShutdownHook() is used to invoke destroy life-cycle method.
		
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		
		System.out.println("==========================================================");
		
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		context.close();
	}

}
