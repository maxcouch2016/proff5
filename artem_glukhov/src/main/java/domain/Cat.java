package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="cat")
public class Cat {
	@Id
	@GeneratedValue(generator = "increment1")
	@GenericGenerator(name = "increment1", strategy = "increment")
	@Column(name="id")
	private Long id;
	
	@Column
	private String name;
	
	@Column(name="color")
	private String color;
	
	
	
	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
	public Cat(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}


	public Cat(Long id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	public Cat() {
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
