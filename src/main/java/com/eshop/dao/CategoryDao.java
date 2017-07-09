package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.eshop.model.CategoryDetails;
@Repository
public class CategoryDao {
	
	@Autowired
	
	SessionFactory sessionfactory;
	public void insertCategory(CategoryDetails cd)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(cd);
		t.commit();
		s.close();
	}
		public List retrieveCategory()
		{

			Session s=sessionfactory.openSession();
			Transaction t=s.beginTransaction();
			String hql = "from CategoryDetails" ;
			Query query = s.createQuery(hql);
			List result = query.list();
s.close();
				return result;
	}
		public void deleteCategory(int categoryId)
		{

			Session s=sessionfactory.openSession();
			Transaction t=s.beginTransaction();
			CategoryDetails c=(CategoryDetails)s.get(CategoryDetails.class,categoryId);

			s.delete(c);
			t.commit();
			s.close();
	}
		public CategoryDetails getCat(int categoryId)
		{

			Session s=sessionfactory.openSession();
			Transaction t=s.beginTransaction();
			CategoryDetails c=(CategoryDetails)s.get(CategoryDetails.class,categoryId);

			
			
			s.close();
			return c;
	}	
}
	

