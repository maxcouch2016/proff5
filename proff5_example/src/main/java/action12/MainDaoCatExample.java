package action12;

import java.util.List;

import org.hibernate.SessionFactory;

import dao.CatDao;
import dao.CatDaoImpl;
import domain.Cat;
import util.HibernateUtil;

public class MainDaoCatExample {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		CatDao catDao = new CatDaoImpl(sessionFactory);
		
		Cat cat2 = new Cat("Marvel", "Green");
		catDao.create(cat2);
		
		List<Cat> cats = catDao.findAll();
		cats.forEach(cat->System.out.println(cat));
		
		if(sessionFactory!=null) sessionFactory.close();
	}
}
