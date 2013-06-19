package model.services;

import java.util.List;

import model.dao.GeekDAO;
import model.entity.Geek;
import model.entity.Interest;
import model.entity.Sexe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

	@Service
	@Transactional
	public class GeekServices {

	private static GeekDAO geekdao;

	@Autowired
	public GeekServices (GeekDAO geekdao)
	{
		this.geekdao = geekdao;
	}

	public List<Geek> findAll(){
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
