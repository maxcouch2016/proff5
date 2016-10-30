package action12;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Cat;
import util.HibernateUtil;

public class MainCatExample2 {
	private static Logger log = Logger.getLogger(MainCatExample2.class);
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		try{
			session = factory.openSession();
			log.info("session opened!");
			session.beginTransaction();

			Cat cat = (Cat) session.get(Cat.class, 1L);
			System.out.println("old cat = "+cat.toString());
			cat.setName("Зайка");
			session.update(cat);
			System.out.println("new cat = "+cat.toString());
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
