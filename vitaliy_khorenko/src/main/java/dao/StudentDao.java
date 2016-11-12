package dao;

import java.io.Serializable;
import java.util.List;

import domain.Student;

public interface StudentDao {

	public List<Student> list();

    public Student get(int id);

    public void saveOrUpdate(Student student);

    public void delete(int id);

	public void create(Student student);
	
}