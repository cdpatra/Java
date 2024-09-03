package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) {
		//insert query
    	String query="INSERT INTO student(id,name,city) VALUES (?,?,?)";
    	int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
