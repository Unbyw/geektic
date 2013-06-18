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
		String request = "select from geek";	
		return em.createQuery(request, Geek.class).getResultList();
	}
	
	public Geek findbyId(long id){
		return em.find(Geek.class, id);		
	}
	
	public Geek findbyNickname(String Nickname){
		return em.find(Geek.class, Nickname);		
	}
	
	public List<Geek> findbyInterest(List<Interest> interests){
		String request = "select * from geek where interest = '"+ interests +"' ";
		return em.createQuery(request, Geek.class).getResultList();
	}
	
	
	public List<Geek> findbySexe(Sexe sexe){
		String request = "select * from geek where sexe = '"+sexe+"' ";
		return em.createQuery(request, Geek.class).getResultList();
	}
	
	public Object newGeek(String nickname, List<Interest> interests, Sexe sexe){
		Geek g;
		g=em.find(Geek.class,findbyNickname(nickname));
	    if(g!=null)
	    {
	        return null;
	    }

	    g = new Geek(nickname, interests, sexe);
	    
	    em.getTransaction().begin();
	    em.persist(g);
	    em.getTransaction().commit();
	    em.close();

	    return g;
	}
}
