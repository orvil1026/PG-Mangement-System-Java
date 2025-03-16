package com.PG.View;

import java.time.LocalDate;

import com.PG.DAO.EmployeeDAO;
import com.PG.Model.Employee;

public class PgMain {

	public static void main(String[] args) {
		
		int rtrn_flg = 0;
		// TODO Auto-generated method stub
		Employee e = new Employee(20000,"9302394234",true,LocalDate.of(2025, 3, 15),null,"New","Orvil");
		EmployeeDAO edao =  new EmployeeDAO();
		try {
			rtrn_flg = edao.insertEmployee(e);
		}catch(Exception ex){
			System.out.println("Error");
		}finally {
			if (rtrn_flg == 1) {
				System.out.println("Inserted");
			}
		}
		
		
		
	}

}
