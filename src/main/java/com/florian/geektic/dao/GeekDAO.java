package com.florian.geektic.dao;

import java.util.*;
import javax.persistence.*;

import org.springframework.stereotype.Repository;

import com.florian.geektic.entity.Geek;

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
	
	
	public List<Geek> findbyCriteria(String nickname, ArrayList<Long> interests, ArrayList<String> sexes){
		String request;
		request = "select g from "+ Geek.class.getName() + " g join g.interests  ";
		request += "where lower(g.nickname) like '"+nickname.toLowerCase()+"%' ";
		if(!interests.isEmpty()){
			request += "and interest in(";
			for (Long interestId : interests){
				request += "'"+interestId+"',";
			}
			request = request.substring(0, request.length() - 1);
		}
		
		if(!sexes.isEmpty()){
			request += "and sexe in(";
			for (String sexe : sexes){
				request += "'"+sexe+"',";
			}
			request = request.substring(0, request.length() - 1);
		}
			
		return em.createQuery(request, Geek.class)
		.getResultList();
	}

}
