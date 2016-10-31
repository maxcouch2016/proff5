package dao;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import domain.Contructors;
import util.HibernateUtil;

public class ContructorsDaoImpl implements ContructorsDao {
	private static Logger log = Logger.getLogger(ContructorsDaoImpl.class);//logger
	private SessionFactory sessionFactory;
	//SINGLETONE
	public ContructorsDaoImpl (SessionFactory sf){
		sessionFactory =sf;
	}
	
	
	@Override
	public Long create(Contructors contructor) {
		Session session = sessionFactory.openSession();
		Long id = null;
		try{
			session.beginTransaction();
			id =(Long)session.save(contructor);
			session.getTransaction().commit();
			}catch(HibernateException e){
				log.error("Transaction contructor failed!!!!!!!");
				session.getTransaction().rollback();
			}finally{
				if (session != null)
					session.close();
			}
		
		return id;
	}

	@Override
	public Contructors read(Long id) {
		
		return null;
	}

	@Override
	public void update(Contructors name) {
		
		
	}

	@Override
	public void delete(Contructors product) {
		
		
	}

	@Override
	public List<Contructors> findALL() {
		Session session = sessionFactory.openSession();
		try {
			Query query = session.createQuery("from Cat");
			return query.list();
		} finally {
			session.close();
		}
		
	}

	
}
