package com.PG.View;

import java.time.LocalDate;
import java.util.ArrayList;

import com.PG.DAO.EmployeeDAO;
import com.PG.DAO.RentDAO;
import com.PG.DAO.RoomDAO;
import com.PG.DAO.SpendingDAO;
import com.PG.DAO.TenantDAO;
import com.PG.Model.Employee;
import com.PG.Model.Rent;
import com.PG.Model.Room;
import com.PG.Model.Spending;
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
		
		//Room
		Room r = new Room(416,2,2);
		Room r2 = new Room();
		ArrayList<Room> rooms = new ArrayList<Room>();
		RoomDAO rdao = new RoomDAO();
		
		// Rent
		Rent re = new Rent(13000, 1, 415, 415, "cash", "monthly",
			"2025-03-16", "2025-03-01", "2025-03-30");
		Rent re2 = new Rent();
		ArrayList<Rent> rents = new ArrayList<Rent>();
		RentDAO rentdao = new RentDAO();
		
		
		// Spending
		Spending s = new Spending("Food", "Dal", 10000, 0, 1, "2025-03-01");
		Spending s2 = new Spending();
		ArrayList<Spending> spendings = new ArrayList<Spending>();
		SpendingDAO spendingdao = new SpendingDAO();
		
		try {
			
			//Employee
//			rtrn_flg = edao.insertEmployee(e);			
//			edao.deleteEmpById(1);			
//			emps = edao.getAllEmp();
			
			
			//Tenant
//			t2 = tdao.getTenantById(2);
//			System.out.println(t2);
//			tenants = tdao.getAllTenants();
			
			
			// Room 
//			rdao.insertRoom(r);
//			r2 = rdao.getRoomById(415);
//			System.out.println(r2);
//			rooms = rdao.getAllRooms();
			
			// Rent
//			rentdao.insertRent(re);
//			rents = rentdao.getAllRents();
			
			
			// Spending
//			spendingdao.insertSpending(s);
//			s2 = spendingdao.getSpendingById(2);
//			System.out.println(s2);
//			spendings = spendingdao.getAllSpending();
			
			for(int i=0; i< spendings.size(); i++) {
				System.out.println(spendings.get(i));
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
