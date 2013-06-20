package com.florian.geektic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.florian.geektic.entity.Interest;


@Repository
public class InterestDAO {
	@PersistenceContext
	private EntityManager em; 
	
	public InterestDAO(){
		
	}
	
	public List<Interest> findAll(){
		String request = "select i from "+ Interest.class.getName() + " i";	
		return em.createQuery(request, Interest.class).getResultList();
	}
	
	public Interest findbyId(long id){
		return em.find(Interest.class, id);		
	}
}

