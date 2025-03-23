package com.PG.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.PG.Helper.Helper;
import com.PG.Model.Rent;

public class RentDAO {

	
	
	public int insertRent(Rent rent) throws ClassNotFoundException, SQLException{
		int output = 0;
		String sql = "Insert into Rent ( t_id, room_no , amount, mode_of_payment, category,trnsc_dt,frm_dt, to_dt  ) values (?,?,?,?,?,?,?,? )"
				+ "";
				
		PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
		
		
		if(rent.isSpecifiedT_id()) {
			preparedStatement.setInt(1, rent.getT_id());
		}else {
			preparedStatement.setNull(1,java.sql.Types.INTEGER);
		}
		
		if(rent.isSpecifiedRoom_no()) {
			preparedStatement.setInt(2, rent.getRoom_no());
		}else {
			preparedStatement.setNull(2,java.sql.Types.INTEGER);
		}
		
		if(rent.isSpecifiedAmount()) {
			preparedStatement.setInt(3, rent.getAmount());
		}else {
			preparedStatement.setNull(3,java.sql.Types.INTEGER);

		}
		
		if(rent.isSpecifiedMode()) {
			preparedStatement.setString(4, rent.getMode());

		}else {
			preparedStatement.setNull(4,java.sql.Types.VARCHAR);
		}
		
		if(rent.isSpecifiedCategory()) {
			preparedStatement.setString(5, rent.getCategory());

		}else {
			preparedStatement.setNull(5,java.sql.Types.VARCHAR);
		}
		
		if(rent.isSpecifiedTrnsc_dt()) {
			preparedStatement.setString(6, rent.getTrnsc_dt());

		}else {
			preparedStatement.setNull(6,java.sql.Types.VARCHAR);
		}
		
		if(rent.isSpecifiedFrm_dt()) {
			preparedStatement.setString(7, rent.getFrm_dt());

		}else {
			preparedStatement.setNull(7,java.sql.Types.VARCHAR);
		}
		
		if(rent.isSpecifiedTo_dt()) {
			preparedStatement.setString(8, rent.getTo_dt());

		}else {
			preparedStatement.setNull(8,java.sql.Types.VARCHAR);
		}
		
		output = preparedStatement.executeUpdate();
		
		return output;
	}
	
	
	public Rent getRentByRoomNo(int roomNo) throws ClassNotFoundException, SQLException {
	    String sql = "SELECT * FROM rent WHERE room_no = ?";
	    Rent rent = new Rent();
	    
	    PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
	    preparedStatement.setInt(1, roomNo);
	    
	    ResultSet resultSet = preparedStatement.executeQuery();
	    
	    if (resultSet.next()) {
	        rent.setRoom_no(resultSet.getInt("room_no"));
	        rent.setT_id(resultSet.getInt("t_id"));
	        rent.setR_id(resultSet.getInt("r_id"));
	        rent.setAmount(resultSet.getInt("amount"));
	        rent.setMode(resultSet.getString("mode_of_payment"));
	        rent.setCategory(resultSet.getString("category"));
	        rent.setTrnsc_dt(resultSet.getString("trnsc_dt"));
	        rent.setFrm_dt(resultSet.getString("frm_dt"));
	        rent.setTo_dt(resultSet.getString("to_dt"));
	    }
	    
	    return rent;
	}
	
	public ArrayList<Rent> getAllEmp() throws ClassNotFoundException, SQLException{
		
		ArrayList<Rent> rent_arr = new ArrayList<Rent>();
		
		String sql = "select * from rent";
		
		
		
		PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
		
		
		ResultSet view = preparedStatement.executeQuery();
		
		while(view.next()) {
			
			Rent rent = new Rent();
			
			 rent.setRoom_no(view.getInt("room_no"));
	        rent.setT_id(view.getInt("t_id"));
	        rent.setR_id(view.getInt("r_id"));
	        rent.setAmount(view.getInt("amount"));
	        rent.setMode(view.getString("mode_of_payment"));
	        rent.setCategory(view.getString("category"));
	        rent.setTrnsc_dt(view.getString("trnsc_dt"));
	        rent.setFrm_dt(view.getString("frm_dt"));
	        rent.setTo_dt(view.getString("to_dt"));
			
			rent_arr.add(rent);

		}
		
		return rent_arr;
		
	}
	
	public int deleteRentById(int r_id) throws ClassNotFoundException, SQLException{
		int output = 0;
		String sql = "Delete from rent where r_id=?";
		
		PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
		
		preparedStatement.setInt(1, r_id);
	
		output = preparedStatement.executeUpdate();
		
		return output;
	}
	
}
