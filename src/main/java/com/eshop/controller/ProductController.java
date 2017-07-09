package com.eshop.controller;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CategoryDao;
import com.eshop.dao.ProductDao;
import com.eshop.dao.SupplierDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;
import com.eshop.model.SupplierDetails;
@Controller
public class ProductController {
	@Autowired
	CategoryDao cd;
	@Autowired
	SupplierDao sd;
	@Autowired
	ProductDao pd;
	@RequestMapping(value="/prod",method=RequestMethod.GET)
	public ModelAndView insprodet()
	{
		ProductDetails p=new ProductDetails();
		List c=cd.retrieveCategory();
		
		/*Iterator i=c.iterator();
		
		while(i.hasNext())
		{
			Object o=i.next();
			CategoryDetails c1=(CategoryDetails)o;
			
			System.out.println(c1.getCategoryDescription());
			}
			*/
		

	List l=sd.retrieveSup();
	
	/*Iterator i1=l.iterator();
	
	while(i1.hasNext())
	{
		Object o=i1.next();
		SupplierDetails s1=(SupplierDetails)o;
		
		System.out.println(s1.getSupplierDescription());
		}
		*/
	List li=pd.retrieveProduct();
	
	ModelAndView mv=new ModelAndView("product","ProductDetails",p);
	mv.addObject("supData",l);
	mv.addObject("catData",c);
	mv.addObject("prodData",li);
	mv.addObject("bname","addProduct");
	return mv;
	}
	@RequestMapping(value="/prod",method=RequestMethod.POST)
	public ModelAndView postProduct(@ModelAttribute("ProductDetails")ProductDetails p)
	{
		
		pd.insertProduct(p);
		ProductDetails p1=new ProductDetails();
		
		ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
		List c=cd.retrieveCategory();
		List l=sd.retrieveSup();
		List li=pd.retrieveProduct();
		
		mv.addObject("supData",l);
		mv.addObject("catData",c);
		mv.addObject("prodData",li);
		mv.addObject("bname","addProduct");
		
		String path="E:\\ekart\\ekart\\src\\main\\webapp\\resources\\images\\";
		path=path+String.valueOf(p.getProductId())+".jpg";
		MultipartFile fild=p.getPimage();
		File f=new File(path);

		try {
			FileOutputStream fos=new  FileOutputStream(f);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			byte[] bt=fild.getBytes();
			bos.write(bt);
			bos.close();

		} catch (Exception e) {
			
		}
return mv;
	}
	@RequestMapping(value="/updateprod",method=RequestMethod.GET)
	public ModelAndView editProduct(@RequestParam("uprod")int id)
	{
		ProductDetails p=pd.getprod(id);
		ModelAndView mv=new ModelAndView("product","ProductDetails",p);
		List c3=pd.retrieveProduct();
		List c=cd.retrieveCategory();
		List l=sd.retrieveSup();
		
	 
	mv.addObject("prodData",c3);
	mv.addObject("supData",l);
	mv.addObject("catData",c);
	mv.addObject("bname","updateProduct");
	return mv;
	}
@RequestMapping("/deladprod")
	public ModelAndView deleteProduct(@RequestParam("adpid")int prid)
	{
		pd.deleteProduct(prid);
		ProductDetails p1=new ProductDetails();
		ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
		List c=cd.retrieveCategory();
		List l=sd.retrieveSup();
		List li=pd.retrieveProduct();
		
		mv.addObject("supData",l);
		mv.addObject("catData",c);
		mv.addObject("prodData",li);
		mv.addObject("bname","addProduct");
	System.out.println("deleted successfull");
		return mv;

	   }
@RequestMapping(value="/userpro",method=RequestMethod.GET)
public ModelAndView userPro()
{
	ProductDetails p=new ProductDetails();
	List li=pd.retrieveProduct();
	ModelAndView mv=new ModelAndView("userproduct","ProductDetails",p);
	mv.addObject("prodData",li);
	return mv;
}
@RequestMapping(value="/getImage",method=RequestMethod.GET)
public ModelAndView getImage(@RequestParam("gima")int id)
{
	ProductDetails p=pd.getprod(id);
	List l=new ArrayList();
	l.add(p);
	
 ModelAndView mv=new ModelAndView("single","ProductDetails",l);


return mv;
}
}

