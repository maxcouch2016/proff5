package domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name= "contructors")

public class Contructors {
	@Id
	@GeneratedValue(generator = "increment1")
	@GenericGenerator(name = "increment1", strategy = "increment")
	@Column(name="id")
	private Long id;
	
	@Column
	 private String name;
	
	
	
public Contructors(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//***************************
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

	@Override
	public String toString() {
		return "Contructors [id=" + id + ", name=" + name + "]";
	}

	
	
	

}
