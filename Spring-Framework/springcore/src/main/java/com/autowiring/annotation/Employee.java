package com.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		System.out.println("Auto wiring using setter");
		this.address = address;
	}

	@Autowired
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
