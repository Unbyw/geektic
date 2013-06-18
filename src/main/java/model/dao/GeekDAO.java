package model.dao;

import java.util.List;
import javax.persistence.*;
import model.entity.Geek;
import org.springframework.stereotype.Repository;

@Repository
public class GeekDAO {

	@PersistenceContext
	private EntityManager em; 
	
	public List<Geek> findAll(){
		String request = "select from geek";	
		return em.createQuery(request, Geek.class).getResultList();
	}
	
	public Geek findbyId(long id){
		return em.find(Geek.class, id);		
	}
	
	public Geek findbyNickname(String Nickname){
		return em.find(Geek.class, Nickname);		
	}
	
	public List<Geek> findbyInterest(String interest){
		String request = "select * from geek where interest = '"+ interest +"' ";
		return em.createQuery(request, Geek.class).getResultList();
	}
	
	
	public List<Geek> findbySex(String sexe){
		String request = "select * from geek where sexe = '"+sexe+"' ";
		return em.createQuery(request, Geek.class).getResultList();
	}
	
	
}
