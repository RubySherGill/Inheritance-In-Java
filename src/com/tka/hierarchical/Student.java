package com.tka.hierarchical;

public class Student extends Person {
	private int rollNo;
	private double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int rollNo, double marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	public void displayStudentInfo() {
		System.out.println("Name :"+getName());
		System.out.println("Age :"+getAge());
		System.out.println("RollNo :"+rollNo);
		System.out.println("Marks :"+marks);
	}

}
