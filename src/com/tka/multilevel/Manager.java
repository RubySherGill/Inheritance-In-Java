package com.tka.multilevel;

public class Manager extends Employee{
	private String team;
	private int teamSize;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, int id, String department, double salary, String team, int teamSize) {
		super(name, age, id, department, salary);
		this.team = team;
		this.teamSize = teamSize;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	public void displayManagerInfo() {
		System.out.println("Name :"+getName());
		System.out.println("Age :"+getAge());
		System.out.println("Id :"+getId());
		System.out.println("Department :"+getDepartment());
		System.out.println("Salary :"+getSalary());
		System.out.println("Team :"+team);
		System.out.println("TeamSize :"+teamSize);
	}

}
