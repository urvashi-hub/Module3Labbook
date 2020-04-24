   package com.cg.lab1.bean;

public class Employee {

	private int employeeId ;
	private String employeeName ;
	private double salary ;
	
	public Employee() {}
	
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee details : \t employeeId=" + employeeId + "\nemployeeName=" + employeeName + "\nsalary=" + salary + "]";
	}
	
}
