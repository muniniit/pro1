package com.eshop.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegDao;
import com.eshop.model.UserCredential;

@Controller
public class LoginController {
@Autowired
RegDao ud;

@RequestMapping("/login")
public ModelAndView gologin()

{



UserCredential uc=new UserCredential();


ModelAndView mv= new ModelAndView("login","UserCredential",uc);
return mv;

}


@SuppressWarnings("unchecked")
@RequestMapping(value = "/login_session_attributes")
public String login_session_attributes(HttpSession session,Model model) {
	String userid = SecurityContextHolder.getContext().getAuthentication().getName();
	UserCredential  user = ud.getUser(userid);
	session.setAttribute("userId",user.getUsername());
	session.setAttribute("name",user.getPassword());
	session.setAttribute("LoggedIn", "true");
	
	 //session.setAttribute("crtcnt",count);
	Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
	String page="";
	String role="ROLE_USER";
	for (GrantedAuthority authority : authorities) 
	{
	  
	     if (authority.getAuthority().equals(role)) 
	     {
	    	 session.setAttribute("UserLoggedIn", true);
	    	 session.setAttribute("Username",user.getUsername());
		 page="/index1";
	    	 session.setAttribute("test",1);
	    	
	     }
	     else 
	     {
	    	 session.setAttribute("Administrator",true);
	    	 session.setAttribute("Username",user.getUsername());
	    	 page="/adminhome";
		
	    }
	}
	return page;
}


}


