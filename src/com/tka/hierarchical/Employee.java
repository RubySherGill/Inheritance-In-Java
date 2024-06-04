package com.tka.hierarchical;

public class Employee extends Person{
	private int id;
	private String department;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, int id, String department, double salary) {
		super(name, age);
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("Name :"+getName());
		System.out.println("Age :"+getAge());
		System.out.println("Id :"+id);
		System.out.println("Department :"+department);
		System.out.println("Salary :"+salary);
		
	}

}
