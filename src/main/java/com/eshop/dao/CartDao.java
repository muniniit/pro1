package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;
@Repository



public class CartDao {
	@Autowired
	SessionFactory sessionfactory;
	public void insertCart(CartDetails cdet)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(cdet);
		t.commit();
		s.close();
	}
	public List retrieveCart(String username)
	{
		

		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		String hql = "from "+" CartDetails "+" where cartUser=" + "'"+username+"'"; 
		Query query = s.createQuery(hql);
		List result = query.list();
		
		s.close();
			return result;
	}

	
}
	
