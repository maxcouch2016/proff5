package HWHibernate;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import HWHibernate.dao.ContructorsDAO;
import HWHibernate.dao.ContructorsDAOImpl;
import HWHibernate.domain.Contructors;
import HWHibernate.service.ContructorsService;
import HWHibernate.service.ContructorsServiceImpl;
import util.HibernateUtil;


public class HWMain {
	private static Logger log = Logger.getLogger(HWMain.class);

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		ContructorsService cont = new ContructorsServiceImpl(new ContructorsDAOImpl(factory));
		List<Contructors> list = cont.getAllContructors();
		list.forEach(System.out::println);
		factory.close();

	}

}
