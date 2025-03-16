package com.PG.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.PG.Helper.Helper;
import com.PG.Model.Employee;



public class EmployeeDAO {
	
	
	public int insertEmployee(Employee employee) throws ClassNotFoundException, SQLException{
		int output = 0;
		String sql = "Insert into Employee (salary, descrptn, nm , mob_no, join_dt, left_dt, is_active  ) values (?, ?, ?, ?, ?, ?, ? )";
				
		PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
		
		
		if(employee.isSpecifiedSalary()) {
			preparedStatement.setInt(1, employee.getSalary());
		}else {
			preparedStatement.setNull(1,java.sql.Types.INTEGER);
		}
		
		if(employee.isSpecifiedDesc()) {
			preparedStatement.setString(2, employee.getDesc());
		}else {
			preparedStatement.setNull(2,java.sql.Types.VARCHAR);
		}
		
		if(employee.isSpecifiedName()) {
			preparedStatement.setString(3, employee.getName());
		}else {
			preparedStatement.setNull(3,java.sql.Types.VARCHAR);

		}
		
		if(employee.isSpecifiedMob_no()) {
			preparedStatement.setString(4, employee.getMob_no());

		}else {
			preparedStatement.setNull(4,java.sql.Types.INTEGER);
		}
		
		if(employee.isSpecifiedJoin_dt()) {
			preparedStatement.setString(5, employee.getJoin_dt());

		}else {
			preparedStatement.setNull(4,java.sql.Types.DATE);
		}
		
		if(employee.isSpecifiedLeft_dt()) {
			preparedStatement.setString(6, employee.getLeft_dt());

		}else {
			preparedStatement.setNull(6,java.sql.Types.DATE);
		}
		
		if(employee.isSpecifiedActive()) {
			preparedStatement.setBoolean(7, employee.isIs_active());

		}else {
			preparedStatement.setNull(7,java.sql.Types.BOOLEAN);
		}
		
		output = preparedStatement.executeUpdate();
		
		return output;
	}
}
