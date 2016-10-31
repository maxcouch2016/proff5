package HWHibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import HWHibernate.domain.Contructors;
import HWHibernate.domain.Employees;

public class ContructorsDAO {
	
private static Logger log = Logger.getLogger(ContructorsDAO.class);
	
	//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	private SessionFactory sessionFactory;
	public ContructorsDAO(SessionFactory sf){
		sessionFactory = sf;;
	}
	
	public Long create(Contructors cont) {
		Session session = sessionFactory.openSession();
		Long id = null;
		try {
			session.beginTransaction();
			id = (Long) session.save(cont);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			log.error("Transaction failed");
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
		}
		return id;
	}

	public Contructors read(Long id) {
		Session session = sessionFactory.openSession();
		Contructors contructors= null;
		try {
			session.beginTransaction();
			contructors =  (Contructors) session.get(Contructors.class, id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			log.error("Transaction failed");
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
		}
		
		return contructors;
	}

	public void update(Contructors product) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(product);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			log.error("Transaction failed");
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
		}
		
	}

	public void delete(Contructors product) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(product);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			log.error("Transaction failed");
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
		}
		
	}
	
	public void delete(int id){
		Contructors cont = read((long) id);
		delete(cont);
	}

	public List<Contructors> findAll() {
		Session session = sessionFactory.openSession();
		try {
			Query query = session.createQuery("from contructors");
			return query.list();
		} finally {
			session.close();
		}
	}


}
