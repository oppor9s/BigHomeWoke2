package com.user.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.entity.Shopcar;

@Repository
public class AddProductDao {
	@Resource
	private SessionFactory sessionFactory;

	  public void save(Shopcar shopcar)  {
			Session session = sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(shopcar);
			tx.commit();
			session.close();
		}
}
