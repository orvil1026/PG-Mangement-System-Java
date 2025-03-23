package com.PG.Model;

import java.time.LocalDate;
import java.time.LocalDate;

public class Spending {
	
	
	private String category;
	private String desc;
	
	private int amount;
	private int e_id;
	private int s_id;
	private int quantity;
	
	private String trnsc_dt;
	
	@Override
	public String toString() {
	    return "Entity{" +
	            "category='" + category + '\'' +
	            ", desc='" + desc + '\'' +
	            ", amount=" + amount +
	            ", e_id=" + e_id +
	            ", s_id=" + s_id +
	            ", quantity=" + quantity +
	            '}';
	}
	
	public boolean isSpecifiedTrnsc_dt() { 
	    return trnsc_dt != null; 
	}

	
	// isSpecified methods
	public boolean isSpecifiedCategory() { 
	    return category != null && !category.trim().isEmpty(); 
	}

	public boolean isSpecifiedDesc() { 
	    return desc != null && !desc.trim().isEmpty(); 
	}

	public boolean isSpecifiedAmount() { 
	    return amount > 0; 
	}

	public boolean isSpecifiedE_id() { 
	    return e_id > 0; 
	}

	public boolean isSpecifiedS_id() { 
	    return s_id > 0; 
	}

	public boolean isSpecifiedQuantity() { 
	    return quantity > 0; 
	}
	
	
	
	public String getTrnsc_dt() {
		return trnsc_dt;
	}

	public void setTrnsc_dt(String trnsc_dt) {
		this.trnsc_dt = trnsc_dt;
	}

	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
		public Spending(String category, String desc, int amount, int e_id, int s_id, int quantity, String trnsc_dt) {
		super();
		this.category = category;
		this.desc = desc;
		this.amount = amount;
		this.e_id = e_id;
		this.s_id = s_id;
		this.quantity = quantity;
		this.trnsc_dt = trnsc_dt;
	}
		public Spending(String category, String desc, int amount, int e_id,  int quantity, String trnsc_dt) {
			super();
			this.category = category;
			this.desc = desc;
			this.amount = amount;
			this.e_id = e_id;
		
			this.quantity = quantity;
			this.trnsc_dt = trnsc_dt;
		}
		
		public Spending() {
			super();
			
		}

	
	
	

}
