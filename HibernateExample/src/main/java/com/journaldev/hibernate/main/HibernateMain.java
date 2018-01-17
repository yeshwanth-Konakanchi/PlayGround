package com.journaldev.hibernate.main;

import java.util.Date;

import org.hibernate.Session;

import com.journaldev.hibernate.model.Employee;
import com.journaldev.hibernate.util.HibernateUtil;

public class HibernateMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Pankaj");
		emp.setRole("CEO");
		emp.setInsertTime(new Date());
		
		//Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//start transaction
//		session.beginTransaction();
		//Save the Model object
		session.save(emp);
		session.flush();
//		session.save(emp);
//		session.flush();
		//Commit transaction
//		session.getTransaction().commit();
		System.out.println("Employee ID="+emp.getId());
//		Session session1 = HibernateUtil.getSessionFactory().getCurrentSession();
//		session1.beginTransaction();
//		//Save the Model object
//		session1.save(emp);
//		//Commit transaction
//		session1.getTransaction().commit();
//		System.out.println("Employee ID="+emp.getId());
//		
		
		
		//terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

}
