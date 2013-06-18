package model.services;

import java.util.List;

import model.dao.InterestDAO;
import model.entity.Interest;
import model.entity.Interest;
import model.entity.Sexe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

	@Service
	@Transactional
	public class InterestServices {

	private static InterestDAO interestdao;

	@Autowired
	public InterestServices (InterestDAO interestdao)
	{
		this.interestdao = interestdao;
	}

	public List<Interest> findAll(){
	return interestdao.findAll();
	}

	public Interest findbyId(Long id){
	return interestdao.findbyId(id);
	}

	public Interest findbyLabel(String label){
		return interestdao.findbyLabel(label);
	}
}
