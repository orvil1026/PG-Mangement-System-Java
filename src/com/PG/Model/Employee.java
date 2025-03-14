package com.PG.Model;

public class Employee {
	
	private int e_id;
	private int salary;
	private StringBuffer desc;
	private StringBuffer name;
	
	public int getE_id() {
		return e_id;
	}
	
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public StringBuffer getDesc() {
		return desc;
	}
	public void setDesc(StringBuffer desc) {
		this.desc = desc;
	}
	public StringBuffer getName() {
		return name;
	}
	public void setName(StringBuffer name) {
		this.name = name;
	}
	
	public Employee(int e_id, int salary, StringBuffer desc, StringBuffer name) {
		super();
		this.e_id = e_id;
		this.salary = salary;
		this.desc = desc;
		this.name = name;
	}
	
	
	
}
