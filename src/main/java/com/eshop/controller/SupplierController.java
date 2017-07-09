package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CategoryDao;
import com.eshop.dao.SupplierDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;
@Controller
public class SupplierController {
	
	
		@Autowired
		SupplierDao sd;
		@RequestMapping(value="/sup",method=RequestMethod.GET)
		public ModelAndView admin1()
		{
			
		SupplierDetails c=new SupplierDetails();
		List c3=sd.retrieveSup();
		
	 ModelAndView mv=new ModelAndView("supplier","SupplierDetails",c);
	mv.addObject("supData",c3);
	mv.addObject("bname","addSupplier");
	return mv;
		}
		@RequestMapping(value="/supplier",method=RequestMethod.POST)
		public ModelAndView admin2(@ModelAttribute("SupplierDetails")SupplierDetails s)
		{
			sd.insertSupplier(s);
			SupplierDetails c1=new SupplierDetails();
			List c3=sd.retrieveSup();
			
		 ModelAndView mv=new ModelAndView("supplier","SupplierDetails",c1);
		mv.addObject("supData",c3);
		mv.addObject("bname","addSupplier");
		return mv;
		}
		@RequestMapping(value="/updatesup",method=RequestMethod.GET)
		public ModelAndView editSupplier(@RequestParam("usup")int id)
		{
			SupplierDetails c=sd.getSup(id);
			List c3=sd.retrieveSup();
			
		 ModelAndView mv=new ModelAndView("supplier","SupplierDetails",c);
		mv.addObject("supData",c3);
		mv.addObject("bname","updateSupplier");
		return mv;
		}

		@RequestMapping("/deletesid")
		public ModelAndView deleteSupplier(@RequestParam("dsid")int said)
		{
			sd.DeleteSupplier(said);
			List c3=sd.retrieveSup();
			SupplierDetails c1=new SupplierDetails();
			
			 ModelAndView mv=new ModelAndView("supplier","SupplierDetails",c1);
			mv.addObject("supData",c3);
			mv.addObject("bname","addSupplier");
			return mv;

	}
}

