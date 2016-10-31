package action12;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Cat;
import util.HibernateUtil;

public class MainCatExample {
	private static Logger log = Logger.getLogger(MainCatExample.class);
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Cat cat = new Cat("Барсик", "Black");
		try{
			session.beginTransaction();
			session.save(cat);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			log.error("Transaction failed");
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}
}
