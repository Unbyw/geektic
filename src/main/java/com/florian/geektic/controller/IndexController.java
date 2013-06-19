package com.florian.geektic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.florian.geektic.services.GeekServices;


@Controller
@RequestMapping("/")
public class IndexController{

public IndexController() {
}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listGeekAll(){
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("geeks", GeekServices.findAll());
		return mav;
	}
}

