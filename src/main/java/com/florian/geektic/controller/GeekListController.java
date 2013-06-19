package com.florian.geektic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.florian.geektic.services.GeekServices;

	@Controller
	@RequestMapping("/Geeks")
	public class GeekListController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listGeekAll(){
		ModelAndView mav = new ModelAndView("listgeek");
		mav.addObject("geeks", GeekServices.findAll());
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView listGeekAll(BindingResult bindingResult){
		ModelAndView mav = new ModelAndView("listgeek");
		mav.addObject("geeks", GeekServices.findAll());
		return mav;
	}
	
}
