package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;
@Repository
public class SupplierDao {
	@Autowired
	SessionFactory sessionfactory;
	public void insertSupplier(SupplierDetails sd)
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(sd);
		t.commit();
		s.close();
	}
	public List retrieveSup()
	{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	String hql = "from SupplierDetails" ;
	Query query = s.createQuery(hql);
	List result = query.list();
	s.close();
    return result;

	}
	public void DeleteSupplier(int supplierId)
	{

		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		SupplierDetails c=(SupplierDetails)s.get(SupplierDetails.class,supplierId);

		s.delete(c);
		t.commit();
		s.close();
}
	public SupplierDetails getSup(int supplierId)
	{

		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		SupplierDetails c=(SupplierDetails)s.get(SupplierDetails.class,supplierId);

		
		
		s.close();
		return c;

}
}

