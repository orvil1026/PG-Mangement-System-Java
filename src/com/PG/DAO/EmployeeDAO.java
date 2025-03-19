package com.PG.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			emp.setSalary(view.wasNull() ? 0 : view.getInt("salary")); 

			String desc = view.getString("descrptn");
			emp.setDesc(desc != null ? desc : null ); // Default to empty string if NULL

			String name = view.getString("nm");
			emp.setName(name != null ? name : null); // Default to empty string

			String mobNo = view.getString("mob_no");
			emp.setMob_no(mobNo != null ? mobNo : null ); // Default to empty string

			String joinDtStr = view.getString("join_dt");
			if(joinDtStr != null) {
				emp.setJoin_dt(joinDtStr); 
			}

			String leftDtStr = view.getString("left_dt");
			if(leftDtStr != null) {
				emp.setLeft_dt(leftDtStr); 
			}
			// Parse if not NULL

			// Handle boolean (stored as INT)
			boolean active = view.getInt("is_active") == 1; 
			if (view.wasNull()) active = false; // If NULL, default to false
			emp.setIs_active(active);

		}
		
		return emp;
	}
	
	public ArrayList<Employee> getAllEmp() throws ClassNotFoundException, SQLException{
		
		ArrayList<Employee> emps_arr = new ArrayList<Employee>();
		
		String sql = "select * from Employee";
		
		
		
		PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
		
		
		ResultSet view = preparedStatement.executeQuery();
		
		while(view.next()) {
			
			Employee emp = new Employee();
			
			emp.setE_id(view.getInt("e_id"));
			
			emp.setSalary(view.wasNull() ? 0 : view.getInt("salary")); 

			String desc = view.getString("descrptn");
			emp.setDesc(desc != null ? desc : null ); // Default to empty string if NULL

			String name = view.getString("nm");
			emp.setName(name != null ? name : null); // Default to empty string

			String mobNo = view.getString("mob_no");
			emp.setMob_no(mobNo != null ? mobNo : null ); // Default to empty string

			String joinDtStr = view.getString("join_dt");
			if(joinDtStr != null) {
				emp.setJoin_dt(joinDtStr); 
			}

			String leftDtStr = view.getString("left_dt");
			if(leftDtStr != null) {
				emp.setLeft_dt(leftDtStr); 
			}
			// Parse if not NULL

			// Handle boolean (stored as INT)
			boolean active = view.getInt("is_active") == 1; 
			if (view.wasNull()) active = false; // If NULL, default to false
			emp.setIs_active(active);
			
			emps_arr.add(emp);

		}
		
		return emps_arr;
		
	}
	
	public int deleteEmpById(int e_id) throws ClassNotFoundException, SQLException{
		int output = 0;
		String sql = "Delete from Employee where e_id=?";
		
		PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
		
		preparedStatement.setInt(1, e_id);
	
		output = preparedStatement.executeUpdate();
		
		return output;
	}
	
	
}
