package com.florian.geektic.dao;

import java.util.List;
import javax.persistence.*;

import org.springframework.stereotype.Repository;

import com.florian.geektic.entity.Geek;
import com.florian.geektic.entity.Interest;

@Repository
public class GeekDAO {

	@PersistenceContext
	private EntityManager em; 
	
	public GeekDAO(){
		
	}
	
	public List<Geek> findAll(){
		String request = "select g from "+ Geek.class.getName() + " g";	
		return em.createQuery(request, Geek.class).getResultList();
	}
	
	public Geek findbyId(long id){
		return em.find(Geek.class, id);		
	}
	
	public Geek findbyNickname(String Nickname){
		return em.find(Geek.class, Nickname);		
	}
	
	public List<Geek> findbyCriteria(Interest interest, String sexe){
		String request = "select g from geek g join g.interests ci where ci.label LIKE :interest and sexe like :sexe";
					
		return em.createQuery(request, Geek.class)
		.setParameter("interests", "%'"+ interest.getLabel() +"'%")
		.setParameter("sexe", "%'"+sexe+"'%")
		.getResultList();
	}
}
