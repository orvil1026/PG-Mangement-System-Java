package com.PG.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	
	public Employee getEmpByID(int e_id) throws ClassNotFoundException, SQLException{
		int output = 0;
		String sql = "select * from Employee where e_id = ? ";
		Employee emp = new Employee();
		emp.setE_id(e_id);
		
		PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
		
		preparedStatement.setInt(1, e_id);
		
		
		ResultSet view = preparedStatement.executeQuery();
		
		while(view.next()) {
			emp.setSalary(view.getInt("salary"));
			emp.setDesc(view.getString("descrptn"));
			emp.setName(view.getString("nm"));
			emp.setMob_no(view.getString("mob_no"));
			emp.setJoin_dt(view.getString("join_dt"));
			emp.setLeft_dt(view.getString("left_dt"));
			emp.setIs_active(view.getBoolean("is_active"));
		}
		
		return emp;
	}
}
