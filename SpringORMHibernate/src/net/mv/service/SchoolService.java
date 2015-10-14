package net.mv.service;

import net.mv.dao.Dao;
import net.mv.domain.School;

public class SchoolService {
	
	Dao dao;
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public void insertSchool(int id, String name) {
		System.out.println("In SchoolService");
		School school = new School(id, name);
		dao.insert(school);
	}
}
