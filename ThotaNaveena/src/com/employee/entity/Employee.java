package com.employee.entity;

public class Employee {
public int employeeId;
public String employeeName;
public int employeeSalary;
public Employee(int employeeId, String employeeName, int employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}
public int calculateSalary(){
	return employeeSalary;
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
public int getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(int employeeSalary) {
	this.employeeSalary = employeeSalary;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName="
			+ employeeName + ", employeeSalary=" + employeeSalary + "]";
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}


}
