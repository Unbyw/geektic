package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.entity.Interest;
import model.entity.Interest;
import model.entity.Sexe;

import org.springframework.stereotype.Repository;

@Repository
public class InterestDAO {

	@PersistenceContext
	private EntityManager em; 
	
	public List<Interest> findAll(){
		String request = "select from Interest";	
		return em.createQuery(request, Interest.class).getResultList();
	}
	
	public Interest findbyId(long id){
		return em.find(Interest.class, id);		
	}
	
	public Interest findbyLabel(String label){
		return em.find(Interest.class, label);		
	}
}

