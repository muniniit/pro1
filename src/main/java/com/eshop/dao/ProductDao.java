package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.eshop.model.ProductDetails;
import com.eshop.model.SupplierDetails;
@Repository
public class ProductDao {
@Autowired
	
	SessionFactory sessionfactory;
	public void insertProduct(ProductDetails pd)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(pd);
		t.commit();
		s.close();
	}
	public List retrieveProduct()
	{

		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		String hql = "from ProductDetails" ;
		Query query = s.createQuery(hql);
		List result = query.list();
		s.close();
			return result;
}
	
	public void deleteProduct(int productid)
	{

		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
	ProductDetails p=(ProductDetails)s.get(ProductDetails.class, productid);
	s.delete(p);
	t.commit();
	s.close();
}	
	public ProductDetails getprod(int productId)
	{

		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		ProductDetails c=(ProductDetails)s.get(ProductDetails.class,productId);

		
		
		s.close();
		return c;

}
	}


