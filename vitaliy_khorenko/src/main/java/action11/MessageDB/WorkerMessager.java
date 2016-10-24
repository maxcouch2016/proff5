package action11.MessageDB;

import java.sql.SQLException;
import java.util.List;

public class WorkerMessager {
	
	Message message;

	public WorkerMessager(Message message) {
		this.message = message;
	}
	
	public WorkerMessager() {
		
	}

	public boolean save(){
		System.out.println("Сохраняю: " + this.message);
		try {
			ServiceDB.insertRecordIntoTable("MESSAGES", "MESSAGE", this.message.message);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}		
	}
	

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "WorkerMessager [message=" + message + "]";
	}

	public List<String> listAll() {
		
		System.out.println("Выбираю: " + this.message);
		try {			
			return ServiceDB.selectAll("MESSAGES", "MESSAGE");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}	
		
	}

}
