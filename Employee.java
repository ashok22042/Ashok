package com.mypackage;

 final  class Employee {



	public static void main(String[] args) {
		Employee e = new Employee (001,"Ashok",5500);
		System.out.println(e.empId);
		System.out.println(e.empName);
		System.out.println(e.salary);
	}
	Employee(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		
	}
	private int empId;
	private String empName;
	private int salary;
	Address address;

	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}

	



}
