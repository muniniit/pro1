package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegDao;
import com.eshop.model.UserCredential;
@Controller
public class ContactusController {
	

	@RequestMapping("/contactus")
	public ModelAndView contactus()

	{



	UserCredential uc=new UserCredential();


	ModelAndView mv= new ModelAndView("contactus");
	return mv;

	}

}
