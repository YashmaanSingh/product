package com.jdbc.learning.dao;

import com.jdbc.learning.entity.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee e);
	public void saveEmployeeByPS(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(int id);
	public void listAllEmp();
	public void getEmpById(int id);
	public void getEmpByName(String name);

}
