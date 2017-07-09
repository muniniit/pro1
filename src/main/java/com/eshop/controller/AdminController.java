package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.AdminDao;

import com.eshop.model.CategoryDetails;
import com.eshop.model.AdminDetails;
@Controller
public class AdminController {
	@Autowired
	AdminDao ad;
	@RequestMapping(value="/admn",method=RequestMethod.GET)
	public ModelAndView admin1()
	{
	AdminDetails a=new AdminDetails();
	return  new ModelAndView("admin","AdminDetails",a);
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.POST)
	public ModelAndView admin2(@ModelAttribute("AdminDetails")AdminDetails a)
	{
		ad.insertAdmin(a);
	return  new ModelAndView("adminsuccess","AdminDetails",a);
	
	}
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public ModelAndView about()
	{

	return  new ModelAndView("about");
	}
	
	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public ModelAndView contact()
	{

	return  new ModelAndView("contactus");
	}
	

}


