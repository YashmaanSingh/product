package com.learning.entity;

public class Employee {
	 private int id; 
	    private String name; 
	    private String gender;
	    private double salary;
	    private String department;
	    
	    
	    
	    
		public Employee() {
			super();
			
		}
		public Employee(int id, String name, String gender, double salary,String department) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.salary = salary;
			this.department=department;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getdepartment() {
			return department;
		}
		public void setdepartment(String department) {
			this.department = department;
		}
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ",department=" + department + "]";
		}
		
		
	  
	   
	}


