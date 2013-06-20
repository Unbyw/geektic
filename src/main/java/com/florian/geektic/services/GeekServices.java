package com.florian.geektic.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.florian.geektic.dao.GeekDAO;
import com.florian.geektic.entity.Geek;

	@Service
	@Transactional
	public class GeekServices {

	private static GeekDAO geekdao;
	
	public GeekServices(){
		
	}
	@Autowired
	public GeekServices (GeekDAO geekdao)
	{
		GeekServices.geekdao = geekdao;
	}

	public static List<Geek> findAll(){
	return geekdao.findAll();
	}

	public static Geek findbyId(Long id){
	return geekdao.findbyId(id);
	}
	
	public static List<Geek> findbyCriteria(String nickname, Long[] interests,String[] sexes){
		return geekdao.findbyCriteria(nickname, interests, sexes);
	}
	
}
