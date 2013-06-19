package com.florian.geektic.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.florian.geektic.dao.GeekDAO;
import com.florian.geektic.entity.Geek;
import com.florian.geektic.entity.Interest;

	@Service
	@Transactional
	public class GeekServices {

	private static GeekDAO geekdao;
	
	public GeekServices(){
		
	}
	@Autowired
	public GeekServices (GeekDAO geekdao)
	{
		this.geekdao = geekdao;
	}

	public static List<Geek> findAll(){
	return geekdao.findAll();
	}

	public static Geek findbyId(Long id){
	return geekdao.findbyId(id);
	}
	
	public static List<Geek> findbyCriteria(Interest interests, String sexe){
		return geekdao.findbyCriteria(interests, sexe);
	}
	
	public static Geek findbyNickname(String nickname){
		return geekdao.findbyNickname(nickname);
	}
}
