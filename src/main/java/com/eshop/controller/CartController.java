package com.eshop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CartDao;
import com.eshop.dao.CategoryDao;
import com.eshop.dao.ProductDao;
import com.eshop.dao.RegDao;
import com.eshop.dao.SupplierDao;
import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;

@Controller
public class CartController {
	@Autowired
	CartDao cad;
	@Autowired
	ProductDao pd;
	
	
	@RequestMapping(value="/addcart",method=RequestMethod.POST)
	public ModelAndView addCart(@RequestParam("pid")String productid,@RequestParam("quantity")int qty,HttpSession session)
	{
		int x=Integer.parseInt(productid);
		
		ProductDetails p1=pd.getprod(x);
		CartDetails c=new CartDetails();
		
		c.setCartUser((String)session.getAttribute("userId"));
		c.setProId(p1.getProductId());
		c.setProName(p1.getProductName());
		c.setProPrice(p1.getProductPrice());
		c.setTotalPrice(c.getTotalPrice()*1);
		cad.insertCart(c);
		List cartList=cad.retrieveCart((String)session.getAttribute("userId"));
		
	ModelAndView mv= new ModelAndView("cart","CartData",cartList);
			
	return mv;

}
}