package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eshop.model.UserCredential;
import com.eshop.model.UserDetails;
@Repository
public class RegDao {
@Autowired
SessionFactory sessionfactory;
public void insertUser(UserDetails ud)
{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	s.save(ud);
	t.commit();
}


public void insertUserCredential(UserCredential uc)
{
	Session s=sessionfactory.openSession();
	Transaction t=s.beginTransaction();
	s.save(uc);
	t.commit();
}
@Transactional
public UserCredential getUser(String username) {
	//creating session object    
			Session session=sessionfactory.openSession();    
			    
			//creating transaction object    
			Transaction t=session.beginTransaction();    
	String hql = "from "+" UserCredential "+" where username=" + "'"+username+"'";
	@SuppressWarnings("rawtypes")
	Query query = session.createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<UserCredential> listUser = (List<UserCredential>) query.list();
	
	if (listUser != null && !listUser.isEmpty()) {
		return listUser.get(0);
	}
	t.commit();//transaction is commited    
	session.close();  
	
	return null;
}

}
