package net.mv.dao;

import net.mv.domain.School;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class Dao {

	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void insert(School school){
		System.out.println("in Dao");
		Session session = sessionFactory.getCurrentSession();
		session.save(school);
	}
}
