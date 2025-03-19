package com.PG.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
	
	private int e_id;
	private int salary;
	
	private boolean is_active;
	
	private LocalDate join_dt;
	private LocalDate left_dt;
	
	private String desc;
	private String name;
	private String mob_no;
	
	
	
	public String getMob_no() {
		return mob_no;
	}

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	
	
	
	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public String getJoin_dt() {		
		return join_dt.format(DateTimeFormatter.ISO_LOCAL_DATE);
	}

	public void setJoin_dt(String dateString) {
		if(dateString == null) {
			this.join_dt = null;
		}
		this.join_dt = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
	}

	public String getLeft_dt() {
		
		return left_dt.format(DateTimeFormatter.ISO_LOCAL_DATE);
	}

	public void setLeft_dt(String dateString) {
		if(dateString == null) {
			this.left_dt = null;
		}
		this.left_dt = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);;
	}

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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isSpecifiedE_id() { 
	    return e_id > 0; 
	}

	public boolean isSpecifiedSalary() { 
	    return salary > 0; 
	}

	public boolean isSpecifiedMob_no() { 
	    return mob_no != null && !mob_no.trim().isEmpty(); 
	}

	public boolean isSpecifiedActive() { 
	    return true; // Boolean always has a value 
	}

	public boolean isSpecifiedJoin_dt() { 
	    return join_dt != null; 
	}

	public boolean isSpecifiedLeft_dt() { 
	    return left_dt != null; 
	}

	public boolean isSpecifiedName() { 
	    return name != null && !name.trim().isEmpty(); 
	}

	public boolean isSpecifiedDesc() { 
	    return desc != null && !desc.trim().isEmpty(); 
	}


	public Employee(int e_id, int salary, String mob_no, boolean is_active, LocalDate join_dt, LocalDate left_dt,
			String desc, String name) {
		super();
		this.e_id = e_id;
		this.salary = salary;
		this.mob_no = mob_no;
		this.is_active = is_active;
		this.join_dt = join_dt;
		this.left_dt = left_dt;
		this.desc = desc;
		this.name = name;
	}
	
	public Employee( int salary, String mob_no, boolean is_active, LocalDate join_dt, LocalDate left_dt,
			String desc, String name) {
		super();
	
		this.salary = salary;
		this.mob_no = mob_no;
		this.is_active = is_active;
		this.join_dt = join_dt;
		this.left_dt = left_dt;
		this.desc = desc;
		this.name = name;
	}
	
	public Employee() {
		super();
	}
	
	
	
	@Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", salary=" + salary +
                ", mob_no='" + mob_no + '\'' +
                ", is_active=" + is_active +
                ", join_dt=" + join_dt +
                ", left_dt=" + left_dt +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
	
}
