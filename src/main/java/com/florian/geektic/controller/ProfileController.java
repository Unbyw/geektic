package com.florian.geektic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.florian.geektic.services.GeekServices;


@Controller
@RequestMapping("/profile")
public class ProfileController{

public ProfileController() {
}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView profileGeek(@PathVariable("id") Long id){
		ModelAndView mav = new ModelAndView("profile");
		mav.addObject("geek", GeekServices.findbyId(id));
		return mav;
	}
}

