package HWHibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import HWHibernate.domain.Employees;
import HWHibernate.domain.Messages;

public class EmployeesDAO {

private static Logger log = Logger.getLogger(EmployeesDAO.class);
	
	//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	private SessionFactory sessionFactory;
	public EmployeesDAO(SessionFactory sf){
		sessionFactory = sf;;
	}
	
	public Long create(Employees empl) {
		Session session = sessionFactory.openSession();
		Long id = null;
		try {
			session.beginTransaction();
			id = (Long) session.save(empl);
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

	public Employees read(Long id) {
		Session session = sessionFactory.openSession();
		Employees employees = null;
		try {
			session.beginTransaction();
			employees =  (Employees) session.get(Employees.class, id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			log.error("Transaction failed");
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
		}
		
		return employees;
	}

	public void update(Employees product) {
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

	public void delete(Employees product) {
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

	public List<Employees> findAll() {
		Session session = sessionFactory.openSession();
		try {
			Query query = session.createQuery("from employees");
			return query.list();
		} finally {
			session.close();
		}
	}
}
