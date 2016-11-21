package HWHibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import HWHibernate.domain.Contructors;

public class ContructorsDAOImpl implements ContructorsDAO {
	
private static Logger log = Logger.getLogger(ContructorsDAO.class);
	
	//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	private SessionFactory sessionFactory;
	public ContructorsDAOImpl(SessionFactory sf){
		sessionFactory = sf;;
	}
	
	@Override
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

	@Override
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

	@Override
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

	@Override
	public void delete(Contructors product) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Contructors tmp = (Contructors)session.get(Contructors.class, product.getName());
			session.delete(tmp);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			log.error("Transaction failed");
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
		}
		
	}
	@Override
	public void delete(int id){
		Contructors cont = read((long) id);
		delete(cont);
	}

	@Override
	public List<Contructors> findAll() {
		Session session = sessionFactory.openSession();
		Query query = null;
		try {
			query = session.createQuery("from Contructors");
			return query.list();
		} finally {
			session.close();
		}
	}


}
