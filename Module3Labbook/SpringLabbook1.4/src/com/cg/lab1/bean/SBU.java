package com.cg.lab1.bean;

import java.util.List;

public class SBU {

	private int sbuCode ;
	private String sbuName ;
	private String sbuHead ;
	private List<Employee> employees ;
	
	public SBU() { }
	
	public SBU(int sbuCode, String sbuName, String sbuHead, List<Employee> employees) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.employees = employees;
	}
	
//	Method to retrieve Employee List Details
	public Employee getEmployeeById(int id) {
		for(Employee e : employees) {
			if(e.getEmployeeId() == id) {
				return e ;
			}
		}
		return null ;
	}
	
//	Getters and Setters
	public int getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
