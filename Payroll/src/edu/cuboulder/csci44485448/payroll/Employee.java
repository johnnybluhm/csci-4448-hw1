package edu.cuboulder.csci44485448.payroll;

public class Employee {
	
	private String name;
	priva te double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return name + " " + salary;
	}
}
