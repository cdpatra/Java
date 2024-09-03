package com.spring.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My program started .....................");
//    	// spring jdbc => jdbcTemplate
//    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//    	JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
//    	
//    	//insert query
//    	String query="INSERT INTO student(id,name,city) VALUES (?,?,?)";
//    	int result = jdbcTemplate.update(query,245,"Manish Kumar","Kanpur");
//    	System.out.println("Number of rows inserted :- " + result);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		Student student = new Student(666, "John Doe", "Lucknow");
		int result = studentDao.insert(student);
		System.out.println("Number of rows inserted -> " + result);
		context.close();
	}
}
