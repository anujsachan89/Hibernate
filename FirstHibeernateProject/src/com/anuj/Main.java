package com.anuj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String [] args)
	{
	Student_Info student1 = new Student_Info();
	
	student1.setName("Golem");

	Student_Info student2 = new Student_Info();
	student2.setName("Anuj");
	
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	
	session.save(student1);
	session.save(student2);
	tx.commit();
	session.close();
}
}
