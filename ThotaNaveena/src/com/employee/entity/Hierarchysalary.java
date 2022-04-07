package com.employee.entity;

public class Hierarchysalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(101,"rama",20000);
		
		Employee labor=new Labor(104,"raghu",10000, 2000);
		Employee manager=new Manager(101,"raghav",30000, 5000);
		
		
		System.out.println("salary of the employee"+emp.calculateSalary());
		System.out.println("salary of the labor"+labor.calculateSalary());
		System.out.println("salary of the manager"+manager.calculateSalary());
	}

}
