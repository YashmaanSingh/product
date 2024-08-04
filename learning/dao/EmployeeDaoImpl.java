package com.jdbc.learning.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.jdbc.learning.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	static Connection connection = null;

	static {
		try {

			Properties ps = new Properties();
			ps.put("user", "root");
			ps.put("password", "root");

//			3rd way
//			Driver d = new Driver();
//			connection = d.connect("jdbc:mysql://localhost:3306/weekend", ps);

//			2nd way
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weekend", ps);

//			1st way
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weekend", "root", "root");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void saveEmployee(Employee e) {

		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into employee(id,name,gender,salary) values(" + e.getId() + ",'"
					+ e.getName() + "','" + e.getGender() + "'," + e.getSalary() + ")");
			System.out.println("Done............");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public void updateEmployee(Employee e) {

		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("update employee set name = '" + e.getName() + "', gender = '" + e.getGender()
					+ "', salary = " + e.getSalary() + " where id = " + e.getId() + "");
			System.out.println("Update done.........");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public void deleteEmployee(int id) {

	}

	@Override
	public void listAllEmp() {
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from employee");

			while (rs.next()) {
				System.out.println("Id = " + rs.getInt(1) + "  Name = " + rs.getString(2) + "  Gender = "
						+ rs.getString(3) + "  Salary = " + rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getEmpById(int id) {

		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from employee where id = " + id + "");

			while (rs.next()) {
				System.out.println("Id = " + rs.getInt(1) + "  Name = " + rs.getString(2) + "  Gender = "
						+ rs.getString(3) + "  Salary = " + rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void getEmpByName(String name) {
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from employee where name = '" + name + "");

			while (rs.next()) {
				System.out.println("Id = " + rs.getInt(1) + "  Name = " + rs.getString(2) + "  Gender = "
						+ rs.getString(3) + "  Salary = " + rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveEmployeeByPS(Employee e) {
		try (PreparedStatement ps = connection
				.prepareStatement("insert into employee(id,name,gender,salary) values(?,?,?,?)");) {
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getGender());
			ps.setInt(4, e.getSalary());
			
			ps.executeUpdate();
			System.out.println("Done.............");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
