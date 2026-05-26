package com.skillio;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(Document.class);
		SessionFactory sf = cf.buildSessionFactory();
		
		Session session =sf.openSession();
		
		session.beginTransaction();
		//----
		
		User user1 = new User();
		
		user1.setId(102);
		user1.setName("Don");
		user1.setAddress("Pune");

		User user2 = new User();
		
		user2.setId(103);
		user2.setName("Aliya");
		user2.setAddress("Mumbai");
		
		Document doc1 = new Document();
		
		doc1.setId(3);
		doc1.setType("Aadhar");
		doc1.setNumber("123456");
		
		Document doc2 = new Document();
		doc2.setId(4);
		doc2.setType("PAN");
		doc2.setNumber("QWE321");
		
		List<Document> docs = new ArrayList<Document>();
		
		docs.add(doc1);
		docs.add(doc2);
		
		user1.setDocs(docs);
		
		user2.setDocs(docs);
		
		session.persist(user1);
		session.persist(user2);
		session.persist(doc1);
		session.persist(doc2);
		
		//---
		session.getTransaction().commit();
		session.close();

    }
}
