package com.azeem.assignment.employees;

public class Developer extends Employee{

	private String email;
	private String phone;
	
	public Developer(String name, String employeeId, double salary, String email, String phone){
		super(name, employeeId, salary);
		this.email = email;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
