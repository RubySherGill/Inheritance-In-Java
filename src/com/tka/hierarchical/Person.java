package com.tka.hierarchical;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayPerson() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
	
	public void displayPersonInfo() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
