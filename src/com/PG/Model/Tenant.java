package com.PG.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tenant {
	
	private int t_id;
	private LocalDate join_dt;
	private int monthly_rent;
	private boolean is_active;
	private LocalDate left_dt;
	private int room_no;
	
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public LocalDate getJoin_dt() {
		return join_dt;
	}
	public void setJoin_dt(LocalDate join_dt) {
		this.join_dt = join_dt;
	}
	public int getMonthly_rent() {
		return monthly_rent;
	}
	
	public void setMonthly_rent(int monthly_rent) {
		this.monthly_rent = monthly_rent;
	}
	public boolean is_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public LocalDate getLeft_dt() {
		return left_dt;
	}
	public void setLeft_dt(LocalDate left_dt) {
		this.left_dt = left_dt;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	
	public Tenant(int t_id, LocalDate join_dt, int monthly_rent, boolean is_active, LocalDate left_dt, int room_no) {
		super();
		this.t_id = t_id;
		this.join_dt = join_dt;
		this.monthly_rent = monthly_rent;
		this.is_active = is_active;
		this.left_dt = left_dt;
		this.room_no = room_no;
	}
	
	

}
