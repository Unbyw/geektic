package controller;

import java.util.ArrayList;
import java.util.List;

import model.entity.Geek;
import model.services.GeekServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	@RequestMapping("/Geeks")
	public class GeekListController {
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Geek ModelAndView(@PathVariable("id") Long id) {
	Geek geek = GeekServices.findbyId(id);
	return geek;
	}
	
	@RequestMapping(value = "/{nickname}", method = RequestMethod.GET)
	@ResponseBody
	public Geek ModelAndView(@PathVariable("nickname") String nickname) {
	Geek geek = GeekServices.findbyNickname(nickname);
	return geek;
	}
	
	@RequestMapping(value = "/{sexe}", method = RequestMethod.GET)
	@ResponseBody
	public List<Geek> ModelAndView(@PathVariable("sexe") String sexe) {
	List<Geek> geeks = GeekServices.findbySexe(sexe);
	return geeks;
	}
}
