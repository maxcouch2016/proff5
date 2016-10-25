package dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Cat;

public class CatDaoImpl implements CatDao{
	
	private static Logger log = Logger.getLogger(CatDaoImpl.class);
	
	private SessionFactory sessionFactory;
	
	public CatDaoImpl(SessionFactory sf){
		sessionFactory = sf;;
	}
	
	@Override
	public Long create(Cat cat) {
		Session session = sessionFactory.openSession();
		Long id = null;
		try {
			session.beginTransaction();
			id = (Long) session.save(cat);
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
	public Cat read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Cat product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cat product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cat> findAll() {
		Session session = sessionFactory.openSession();
		try {
			Query query = session.createQuery("from Cat");
			return query.list();
		} finally {
			session.close();
		}
	}

}
