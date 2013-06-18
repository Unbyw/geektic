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

	private GeekDAO geekdao;

	@Autowired
	public GeekServices (GeekDAO geekdao)
	{
		this.geekdao = geekdao;
	}

	public List<Geek> getGeeks(){
	return geekdao.findAll();
	}

	public Geek getGeek(Long id){
	return geekdao.findbyId(id);
	}
	
	public List<Geek> getGeeksInterest(List<Interest> interests){
		return geekdao.findbyInterest(interests);
	}
	
	public List<Geek> getGeeksSexe(Sexe sexe){
		return geekdao.findbySexe(sexe);
	}
	
	public Geek getGeeksPseudo(String nickname){
		return geekdao.findbyNickname(nickname);
	}
	
}
