package HWHibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="messages")
public class Messages {
	
	@Id
	@GeneratedValue(generator = "increment1")
	@GenericGenerator(name = "increment1", strategy = "increment")
	@Column(name="id")
	private Long id;
	
	@Column(name="employees_id")
	private Long employeesId;	
	
	@Column(name="message")
	private String message;
	

	public Messages() {
	}

	public Messages(Long employeesId, String message) {
		this.employeesId = employeesId;
		this.message = message;
	}

	public Messages(Long id, Long employeesId, String message) {
		this.id = id;
		this.employeesId = employeesId;
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmployeesId() {
		return employeesId;
	}

	public void setEmployeesId(Long employeesId) {
		this.employeesId = employeesId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
