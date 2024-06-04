package com.tka.multilevel;

public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager("Myrub", 26, 101, "IT", 70000, "DevTeam", 6);
		System.out.println("============Person Info==============");
		manager.displayPerson();

		System.out.println("=============Employee Info============");
		manager.displayEmployeeInfo();

		System.out.println("==============Manager Info===========");
		manager.displayManagerInfo();

	}

}
