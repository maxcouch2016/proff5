package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="employees")

public class Employees {
	Long id;
	String name;
	int salary;
	
	
	public Employees(Long id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employees(String name, int salary) {
		super();
	//	this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
