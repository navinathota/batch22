package com.employee.entity;

public class Manager extends Employee{
public int incentive;
	public Manager(int employeeId, String employeeName, int employeeSalary, int incentive) {
		super(employeeId, employeeName, employeeSalary);
		// TODO Auto-generated constructor stub
		this.incentive=incentive;
	}
	public int calculateSalary(){
		return employeeSalary+incentive;
		
	}
}
