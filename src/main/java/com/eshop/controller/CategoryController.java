package com.eshop.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.AdminDao;
import com.eshop.dao.CategoryDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;
@Controller
public class CategoryController {
	@Autowired
	CategoryDao cd;
	@RequestMapping(value="/categry",method=RequestMethod.GET)
	public ModelAndView cat()
	{
		CategoryDetails c=new CategoryDetails();
		List c3=cd.retrieveCategory();
		
		
	 ModelAndView mv=new ModelAndView("category","CategoryDetails",c);
	mv.addObject("catData",c3);
	mv.addObject("bname","addCategory");
	return mv;
	}
	@RequestMapping(value="/category",method=RequestMethod.POST)
	public ModelAndView cat1(@ModelAttribute("CategoryDetails")CategoryDetails c)
	{
		cd.insertCategory(c);
		CategoryDetails c1=new CategoryDetails();
		List c3=cd.retrieveCategory();
		
	 ModelAndView mv=new ModelAndView("category","CategoryDetails",c1);
	mv.addObject("catData",c3);
	mv.addObject("bname","addCategory");
	return mv;
	}	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public ModelAndView editCategory(@RequestParam("ucat")int id)
	{
		CategoryDetails c=cd.getCat(id);
		List c3=cd.retrieveCategory();
		
	 ModelAndView mv=new ModelAndView("category","CategoryDetails",c);
	mv.addObject("catData",c3);
	mv.addObject("bname","updateCategory");
	return mv;
	}
	
	@RequestMapping("/deletecid")
	public ModelAndView deleteCategory(@RequestParam("dcid")int caid)
	{
		cd.deleteCategory(caid);
		List c3=cd.retrieveCategory();
		CategoryDetails c1=new CategoryDetails();
		 ModelAndView mv=new ModelAndView("category","CategoryDetails",c1);
		mv.addObject("catData",c3);
		mv.addObject("bname","addCategory");
		return mv;
}
	
}



