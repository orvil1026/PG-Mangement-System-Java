package com.PG.View;

import java.time.LocalDate;

import com.PG.DAO.EmployeeDAO;
import com.PG.Model.Employee;

public class PgMain {

	public static void main(String[] args) {
		
		int rtrn_flg = 0;
		// TODO Auto-generated method stub
		Employee e = new Employee(20000,"9302394234",true,LocalDate.of(2025, 3, 15),null,"New","Orvil");
		Employee e1 = new Employee();
		
		EmployeeDAO edao =  new EmployeeDAO();
		try {
//			rtrn_flg = edao.insertEmployee(e);
			e1 = edao.getEmpByID(1);
		}catch(Exception ex){
			System.out.println("Error");
			System.out.println(ex.toString());
		}finally {
			if (rtrn_flg == 1) {
				System.out.println("Inserted");
			}
			System.out.println(e1);
		}
		
		
		
		
		
		
	}

}
