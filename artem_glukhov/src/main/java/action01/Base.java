//� ������������ Base �������� ��������� �������������.
//� ����� Base �������� ����� 
// boolean auth(String login, String pass)
//� ������� ������ MainBase ������� ������ ������ 
//Base � ������� ������� ����� � ������, ����������
//���� �� ����� ������������.
package action01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Base {

	  Base( ) { 
		  User user1 = new User("admin","admin");
		  User user2 = new User("user","11111");
	}
	
	
	
	
	boolean auth(String login, String pass){
		Scanner scan = new Scanner (System.in);
		 System.out.println("enter login");
		 String log = scan.next();
		 System.out.println("enter password");
		  String pasword = scan.next();
		  User user = new  User(log,pasword);
		return true;
		
	}
	
	
	public static void main(String[] args) {
	
	 
			 
	}

//	@Override
	//public boolean equals (String admin, String pasword){
	//	if user.
		
		
	};

