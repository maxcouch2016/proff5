package action12;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import domain.Contructors;
import util.HibernateUtil;
public class MainContructors {
	
		private static Logger log = Logger.getLogger(MainCatExample2.class);
		
		public static void main(String[] args) {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			
			try{
				session = factory.openSession();
				log.info("session opened!");
				session.beginTransaction();
			//	Cat cat = (Cat) session.get(Cat.class, 1L);
				Contructors contr = (Contructors) session.get(Contructors.class, 1L);
				System.out.println("Contruct = "+contr.toString());
				contr.setName("ПрАТ ПРОФИТ" );
				
				session.update(contr);
				System.out.println("new cat = "+contr.toString());
				session.getTransaction().commit();
			} catch (HibernateException e) {
				log.error("Transaction failed!!!");
				session.getTransaction().rollback();
			
			} finally {
				if (session != null)
					session.close();
			}
			session.close();
		}
	
}




