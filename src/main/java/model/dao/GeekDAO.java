package model.dao;

import java.util.List;
import javax.persistence.*;
import model.entity.Geek;
import model.entity.Interest;
import model.entity.Sexe;

import org.springframework.stereotype.Repository;

@Repository
public class GeekDAO {

	@PersistenceContext
	private EntityManager em; 
	
	public List<Geek> findAll(){
		String request = "select g from geek g";	
		return em.createQuery(request, Geek.class).getResultList();
	}
	
	public Geek findbyId(long id){
		return em.find(Geek.class, id);		
	}
	
	public Geek findbyNickname(String Nickname){
		return em.find(Geek.class, Nickname);		
	}
	
	public List<Geek> findbyCriteria(Interest interest, String sexe){
		String request = "select g from geek g join g.interests ci where ci.label LIKE :interest";
					
		return em.createQuery(request, Geek.class)
		.setParameter("interests", "%"+ interest.getLabel() +"%")
		.setParameter("sexe", sexe)
		.getResultList();
	}
}
