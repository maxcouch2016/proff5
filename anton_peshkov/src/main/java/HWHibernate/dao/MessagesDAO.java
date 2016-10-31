package HWHibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import HWHibernate.domain.Messages;


public class MessagesDAO {

private static Logger log = Logger.getLogger(MessagesDAO.class);
	
	//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	private SessionFactory sessionFactory;
	public MessagesDAO(SessionFactory sf){
		sessionFactory = sf;;
	}
	
	public Long create(Messages messages) {
		Session session = sessionFactory.openSession();
		Long id = null;
		try {
			session.beginTransaction();
			id = (Long) session.save(messages);
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

	public Messages read(Long id) {
		Session session = sessionFactory.openSession();
		Messages messages = null;
		try {
			session.beginTransaction();
			messages =  (Messages) session.get(Messages.class, id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			log.error("Transaction failed");
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
		}
		
		return messages;
	}

	public void update(Messages product) {
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

	public void delete(Messages product) {
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

	public List<Messages> findAll() {
		Session session = sessionFactory.openSession();
		try {
			Query query = session.createQuery("from messages");
			return query.list();
		} finally {
			session.close();
		}
	}
}
