package model.services;

import java.util.List;

import model.dao.GeekDAO;
import model.entity.Geek;

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
	
	public List<Geek> getGeeksInterest(String interest){
		return geekdao.findbyInterest(interest);
	}
	
	public List<Geek> getGeeksSex(String sexe){
		return geekdao.findbySex(sexe);
	}
	
	public Geek getGeeksPseudo(String nickname){
		return geekdao.findbyNickname(nickname);
	}

}
