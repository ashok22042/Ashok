package com.mypackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column (name="EMPID")
	private int employeeId;
	@Column (name="EMPNAME")
	private String employeeName;
	@Column (name="SALARY")
	private int employeesalary;
	
	public int getEmpId() {
		return employeeId;
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



	public int getEmployeesalary() {
		return employeesalary;
	}



	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}



	public void setEmployeeId(int i, int j, int k, int l, int m, int n) {
		// TODO Auto-generated method stub
		
	}

		
	

	public void setEmployeeName(String string, String string2, String string3, String string4, String string5,
			String string6) {
		// TODO Auto-generated method stub
		
	}



	

}
