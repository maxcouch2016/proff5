package HWHibernate;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import HWHibernate.dao.ContructorsDAO;
import HWHibernate.domain.Contructors;
import util.HibernateUtil;


public class HWMain {
	private static Logger log = Logger.getLogger(HWMain.class);

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		ContructorsDAO cont = new ContructorsDAO(factory);
		cont.delete(4);
		factory.close();

	}

}
