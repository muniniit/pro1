package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegDao;
import com.eshop.model.UserCredential;
import com.eshop.model.UserDetails;

@Controller
public class RegisterController {
	@Autowired
	RegDao rd;
	@RequestMapping(value="/reg",method=RequestMethod.GET)
	public ModelAndView reg1()
	{
		UserDetails u=new UserDetails();
	return  new ModelAndView("register","UserDetails",u);
	}
	
	

	@RequestMapping(value="home",method=RequestMethod.GET)
	public String adm()
	{
	return "index1";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView reg2(@ModelAttribute("UserDetails")UserDetails u)
	{
		
		  
		 UserCredential uc=new UserCredential();
		  uc.setUsername(u.getUsername());
		  uc.setPassword(u.getPassword());
		  uc.setRole("ROLE_USER");
		  uc.setEnabled(true);
		  rd.insertUserCredential(uc);
		rd.insertUser(u);
		ModelAndView mv=new ModelAndView("register1","UserDetails",u);
	return mv;
	
	}

}
