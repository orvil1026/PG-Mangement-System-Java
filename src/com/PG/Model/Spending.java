package com.PG.Model;

public class Spending {
	
	private int quantity;
	private StringBuffer category;
	private StringBuffer desc;
	private int amount;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public StringBuffer getCategory() {
		return category;
	}
	public void setCategory(StringBuffer category) {
		this.category = category;
	}
	public StringBuffer getDesc() {
		return desc;
	}
	public void setDesc(StringBuffer desc) {
		this.desc = desc;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Spending(int quantity, StringBuffer category, StringBuffer desc, int amount) {
		super();
		this.quantity = quantity;
		this.category = category;
		this.desc = desc;
		this.amount = amount;
	}
	
	

}
