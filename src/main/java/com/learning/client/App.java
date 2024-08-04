
package com.learning.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 // import org.hibernate.cfg.Configuration;

import com.learning.entity.Employee;

public class App {
	

	public static void main(String[] args) {
		Employee yash = new Employee(1,"DB","male",80000,"tech");
		
		// Configuration cfg = new  Configuration ().configure();
		 
		 
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	     Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	     
		 SessionFactory sf 	= meta.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();		 
		 session.persist(yash);
		 tx.commit();	
		 
		 
		/*      // first method
		 * Configuration cfg = new Configuration().configure("hibernate.config.xml");


        //		second method
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();
	     Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	     
	     // third method
		SessionFactory sf = new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		Session session = sf.openSession();  
		
		
		
		Employee employee = sesion.get(Employee.class, 21);
		System.out.println(employee);
	Transaction tx = sesion.beginTransaction();
		session.persist(yash);		
		tx.commit();*/

	}
	

}









