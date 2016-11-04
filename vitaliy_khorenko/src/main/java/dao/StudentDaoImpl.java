package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;

import domain.Student;

public class StudentDaoImpl implements StudentDao {
	
	private static Logger logger = Logger.getLogger(StudentDaoImpl.class);
	
	private SessionFactory factory;
	
	public StudentDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> list() {
		Session session = null;
        try {
        	session = factory.openSession();
            session.beginTransaction();
            List<Student> theStudents = session.createQuery("from Student").getResultList();                        
            session.getTransaction().commit();
            return theStudents;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
	}

	@Override
	public Student get(int id) {
		Session session = factory.openSession(); 
		session.beginTransaction();
		Student student = (Student) session.get(Student.class, id);
		return student;
	}

	@Override
	public void saveOrUpdate(Student student) {
		factory.openSession().save(student);
	}

	@Override
	public void delete(int id) {
		Session session = factory.openSession(); 
		session.beginTransaction();
		Student student = (Student) session.get(Student.class, id);
		session.getTransaction().commit();
		session.beginTransaction();
		System.out.println(student);
		session.delete(student);
		session.getTransaction().commit();		
	}


	@Override
    public void create(Student student) {
        Session session = null;
        try {
            session = factory.openSession();
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}