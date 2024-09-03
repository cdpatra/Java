package com.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("temp1") //qualifier is used to resolve ambiguity if there are more than one bean of same type;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Auto wiring using setter");
		this.address = address;
	}

	public Employee(Address address) {
		super();
		System.out.println("Auto wiring using Constructor");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
}
