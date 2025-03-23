package com.PG.Model;




public class Rent {
	
	private int amount;
	private int t_id;
	private int r_id;
	private int room_no;
	
	private String mode;
	private String category;

	
	private String trnsc_dt;
	private String frm_dt;
	private String to_dt;
	
	
	
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getTrnsc_dt() {
		return trnsc_dt;
	}
	public void setTrnsc_dt(String trnsc_dt) {
		this.trnsc_dt = trnsc_dt;
	}
	public String getFrm_dt() {
		return frm_dt;
	}
	public void setFrm_dt(String frm_dt) {
		this.frm_dt = frm_dt;
	}
	public String getTo_dt() {
		return to_dt;
	}
	public void setTo_dt(String to_dt) {
		this.to_dt = to_dt;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public boolean isSpecifiedAmount() { 
	    return amount > 0; 
	}

	public boolean isSpecifiedT_id() { 
	    return t_id > 0; 
	}

	public boolean isSpecifiedR_id() { 
	    return r_id > 0; 
	}

	public boolean isSpecifiedRoom_no() { 
	    return room_no > 0; 
	}

	public boolean isSpecifiedMode() { 
	    return mode != null && !mode.trim().isEmpty(); 
	}

	public boolean isSpecifiedCategory() { 
	    return category != null && !category.trim().isEmpty(); 
	}

	public boolean isSpecifiedTrnsc_dt() { 
	    return trnsc_dt != null; 
	}

	public boolean isSpecifiedFrm_dt() { 
	    return frm_dt != null; 
	}

	public boolean isSpecifiedTo_dt() { 
	    return to_dt != null; 
	}

	
	public Rent(int amount, int t_id, int r_id, int room_no, String mode, String category,
			String trnsc_dt, String frm_dt, String to_dt) {
		super();
		this.amount = amount;
		this.t_id = t_id;
		this.r_id = r_id;
		this.room_no = room_no;
		this.mode = mode;
		this.category = category;
		this.trnsc_dt = trnsc_dt;
		this.frm_dt = frm_dt;
		this.to_dt = to_dt;
	}
	
	public Rent() {
		super();
		
	}
	
	
	@Override
	public String toString() {
	    return "Transaction{" +
	            "amount=" + amount +
	            ", t_id=" + t_id +
	            ", r_id=" + r_id +
	            ", room_no=" + room_no +
	            ", mode='" + mode + '\'' +
	            ", category='" + category + '\'' +
	            ", trnsc_dt=" + trnsc_dt +
	            ", frm_dt=" + frm_dt +
	            ", to_dt=" + to_dt +
	            '}';
	}
	

}
