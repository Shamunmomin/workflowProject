package com.tka.OrganizationWorkflow.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.OrganizationWorkflow.entity.PracticeCountry;
import com.tka.OrganizationWorkflow.entity.PracticeEmployee;

@Repository
public class MainDao {

	@Autowired
	SessionFactory factory;

	
	  List<PracticeCountry> list=null;

	public String addrecord(PracticeCountry c) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();

			session.persist(c);
			tx.commit();

			msg="country record added successfuly..";

		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session != null) {
				session.close();
			}
		}

		return msg;
	}

	public String updaterecord(PracticeCountry c, int id) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			PracticeCountry country=session.get(PracticeCountry.class, id);
			country.setCname(c.getCname());
			session.merge(country);
			
			tx.commit();
			msg="record update successfully...";
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return msg;
	}

	public String deleterecord(int id) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			PracticeCountry country=session.get(PracticeCountry.class, id);
			session.remove(country);
			
			tx.commit();
			msg="record delete successfully..";
			
		} catch (Exception e) {
			if(tx !=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session !=null) {
				session.close();
			}
		}
		
		return msg;
	}

	public List<PracticeCountry> getall() {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			String q="from PracticeCountry";
			Query<PracticeCountry> query=session.createQuery(q,PracticeCountry.class);
		     list = query.getResultList();
			
			tx.commit();
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return list;
	}

	
	
	
	//ADD EMPLOYEE RECORD	
	public String getemp(PracticeEmployee ee) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			session.persist(ee);
			tx.commit();
			msg="record added successfully...";
		} catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		} 
			
		
		
		return msg;
	}




}
