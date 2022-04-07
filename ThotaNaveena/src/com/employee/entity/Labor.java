package com.employee.entity;

public class Labor extends Employee {
public int overload;
	public Labor(int employeeId, String employeeName, int employeeSalary, int overload) {
		super(employeeId, employeeName, employeeSalary);
		// TODO Auto-generated constructor stub
		this.overload=overload;
	}
	
	public int calculateSalary(){
		return employeeSalary+overload;
		
	}
}
