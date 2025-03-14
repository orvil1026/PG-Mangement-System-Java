package com.PG.Model;

import java.time.LocalDate;


public class Rent {
	
	private int amount;
	private int t_id;
	private StringBuffer mode;
	private LocalDate trnsc_dt;
	private LocalDate frm_dt;
	private LocalDate to_dt;
	private int room_no;
	private StringBuffer category;
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
	public StringBuffer getMode() {
		return mode;
	}
	public void setMode(StringBuffer mode) {
		this.mode = mode;
	}
	public LocalDate getTrnsc_dt() {
		return trnsc_dt;
	}
	public void setTrnsc_dt(LocalDate trnsc_dt) {
		this.trnsc_dt = trnsc_dt;
	}
	public LocalDate getFrm_dt() {
		return frm_dt;
	}
	public void setFrm_dt(LocalDate frm_dt) {
		this.frm_dt = frm_dt;
	}
	public LocalDate getTo_dt() {
		return to_dt;
	}
	public void setTo_dt(LocalDate to_dt) {
		this.to_dt = to_dt;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public StringBuffer getCategory() {
		return category;
	}
	public void setCategory(StringBuffer category) {
		this.category = category;
	}
	
	public Rent(int amount, int t_id, StringBuffer mode, LocalDate trnsc_dt, LocalDate frm_dt, LocalDate to_dt,
			int room_no, StringBuffer category) {
		super();
		this.amount = amount;
		this.t_id = t_id;
		this.mode = mode;
		this.trnsc_dt = trnsc_dt;
		this.frm_dt = frm_dt;
		this.to_dt = to_dt;
		this.room_no = room_no;
		this.category = category;
	}
	

}
