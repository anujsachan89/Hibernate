package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main (String [] args)
	{
		Student student = new Student();
	 student.setStudent_name("Anuj");
		
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("9874512547");
		
		//this is a important step
		studentDetail.setStudent(student);
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		// I am not saving student object but still it will be saved in database
		// magic of one's to one mapping
		
		session.save(studentDetail);
		session.getTransaction().commit();	
	}
	}