package com.florian.geektic.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.florian.geektic.services.GeekServices;
import com.florian.geektic.services.InterestServices;

@Controller
@RequestMapping("search")
public class SearchController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listInterestAll(){
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("interests", InterestServices.findAll());
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST) 
	public ModelAndView search(@RequestParam(defaultValue="") String nickname,
								 ArrayList<Long> interests, 
								 ArrayList<String> sexes) {
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("interests", InterestServices.findAll());
		System.out.println(nickname);
		mav.addObject("geeks", GeekServices.findbyCriteria(nickname, interests, sexes));
		return mav ;
		
		
		}	
}
