package dao;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Employees;
import util.HibernateUtil;

public interface EmployeesDao {
	
	Long create (Employees employees);
	
	

}
