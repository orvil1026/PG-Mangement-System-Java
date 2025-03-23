package com.PG.View;

import java.time.LocalDate;
import java.util.ArrayList;

import com.PG.DAO.EmployeeDAO;
import com.PG.DAO.TenantDAO;
import com.PG.Model.Employee;
import com.PG.Model.Tenant;

public class PgMain {

	public static void main(String[] args) {
		
		int rtrn_flg = 0;
		// TODO Auto-generated method stub
		
		//Employee
		Employee e = new Employee(20000,"9302394234",true,"2025-03-16",null,"New","Orvil");
		Employee e1 = new Employee();
		ArrayList<Employee> emps = new ArrayList<Employee>();
		EmployeeDAO edao =  new EmployeeDAO();
		
		//Tenant
		Tenant t = new Tenant("2025-03-16",  13000, true, null, 415, "Orvil", "9011189660");
		Tenant t2 = new Tenant();
		ArrayList<Tenant> tenants = new ArrayList<Tenant>();
		
		
		TenantDAO tdao = new TenantDAO();
		
		try {
			
			//Employee
//			rtrn_flg = edao.insertEmployee(e);			
//			edao.deleteEmpById(1);			
//			emps = edao.getAllEmp();
			
			
			
			t2 = tdao.getTenantById(2);
			System.out.println(t2);
			tenants = tdao.getAllTenants();
			
			for(int i=0; i< tenants.size(); i++) {
				System.out.println(tenants.get(i));
			}
			
		}catch(Exception ex){
			System.out.println("Error");
			System.out.println(ex.toString());
		}finally {
			if (rtrn_flg == 1) {
				System.out.println("Inserted");
			}
//			System.out.println(e1);
		}
		
		
		
		
		
		
	}

}
