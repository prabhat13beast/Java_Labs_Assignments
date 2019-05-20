package com.ibm.eis.bean;
public class Employee {
		// TODO Auto-generated method stub
	private	int id;
	private	String name , designation ,insuranceScheme;
	private	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "id:" +id+"\t"+ "name:" +name+"\t"+ "designation:" +designation+"\t"+ "salary:" +salary;
	
		

	}
}

