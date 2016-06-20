package com.save;

import org.hibernate.Hibernate;
import org.hibernate.Session;

public class SaveUpdateMain {
	public static void main(String[] args) {
		SaveUpdateMain sm = new SaveUpdateMain();
		sm.udpate();
	}
	
	public void save(){
		Student s = new Student();
		s.setId(4);
		s.setName("Harini");
		s.setCourse("CSE");
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
	}
	
	public void udpate(){
		Session session = HibernateUtil.getSession();
		Student s = (Student) session.get(Student.class, 2);
		System.out.println(s);
		s.setName("Kashyap");
		session.beginTransaction();
		session.update(s);
		session.getTransaction().commit();
		
	}
	
	public void saveOrUpdate(){
		Student s = new Student();
		s.setId(2);
		s.setName("Finkoveix");
		s.setCourse("ECE");
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.saveOrUpdate(s);
		session.getTransaction().commit();
	}
	
	public void delete(){
		Session session = HibernateUtil.getSession();
		Student s = (Student) session.get(Student.class, 3);
		session.beginTransaction();
		session.delete(s);
		session.getTransaction().commit();
	}
}
