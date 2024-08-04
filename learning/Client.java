package com.jdbc.learning;

import java.sql.SQLException;

import com.jdbc.learning.dao.EmployeeDao;
import com.jdbc.learning.dao.EmployeeDaoImpl;
import com.jdbc.learning.entity.Employee;

public class Client {

	public static void main(String[] args) throws SQLException {

		Employee vikas = new Employee(7, "Nitin", "male", 12765);

//		DriverManager.getConnection("jdbc:mysql://localhost:3306/weekend", "root", "root").createStatement().executeUpdate("insert into mytable (name,gender) values('Vikas','male')");
		EmployeeDao edao = new EmployeeDaoImpl();
//		edao.saveEmployee(vikas);
//		edao.updateEmployee(vikas);
		edao.listAllEmp();
//		edao.getEmpById(2);
//		edao.getEmpByName("1 'or 1=1");
		
//		edao.saveEmployeeByPS(vikas);
		System.out.println("Transaction successful...................");

	}

}
