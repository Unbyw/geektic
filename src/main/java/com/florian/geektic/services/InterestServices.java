package com.florian.geektic.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.florian.geektic.dao.InterestDAO;
import com.florian.geektic.entity.Interest;

	@Service
	@Transactional
	public class InterestServices {

	private static InterestDAO interestdao;
	
	public InterestServices(){
		
	}
	
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
