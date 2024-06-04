package com.tka.hierarchical;

public class Test {
	public static void main(String[] args) {
		System.out.println("============Person Info==============");
		Person person = new Person("Myrub",26);
		person.displayPerson(); 
		
		System.out.println("==============Manager Info");
		Manager manager = new Manager("Kiran",35,"QA Team",6);
		manager.displayManagerInfo();
		

		System.out.println("=============Employee Info============");
		Employee employee = new Employee("Mihir",26,101,"IT",70000);
		employee.displayEmployeeInfo();

		System.out.println("==============Student Info===========");
		Student student = new Student("Ruby",26,102,88);
		student.displayStudentInfo();
		

	}

}
