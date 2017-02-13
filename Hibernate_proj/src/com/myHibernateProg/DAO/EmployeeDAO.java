package com.myHibernateProg.DAO;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myHibernateProg.DTO.EmployeeDTO;

public class EmployeeDAO {
	public EmployeeDAO() {
		System.out.println("DAO object cerated");
	}
	public void save(EmployeeDTO dto)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		
	}

}
