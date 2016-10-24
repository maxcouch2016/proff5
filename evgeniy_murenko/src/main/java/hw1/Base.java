package hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*В класс Base добавить метод
 - void usersToFile(String fileName)
 - User[] usersFromFile(String fileName)
 - void usersSerializeToFile(String fileName)
 - User[] usersDeSerializeFromFile(String fileName)
 */


import java.util.HashSet;
import java.util.Scanner;

public class Base implements Serializable {
	private HashSet<User> baseSet;

	public Base() {
		baseSet = new HashSet<>();
		User us1 = new User("Igor", "igor123", "123", new Date (2013, 11, 25));
		User us2 = new User("Alex", "alex456", "456", new Date(2013, 11, 25));
		User us3 = new User("Jan", "jan789", "789", new Date(2013, 11, 25));
		baseSet.add(us1);
		baseSet.add(us2);
		baseSet.add(us3);
	}
	
	public void usersSerializeToFile(String fileName){
	

	}

	public void usersToFile(String fileName) {
		File file = new File(fileName);
		try {
			FileWriter fw = new FileWriter(file);
			baseSet.forEach(t -> {
				try {
					SimpleDateFormat format = new SimpleDateFormat();
					fw.write(t.getName()+"#"+t.getLogin()+"#"+t.getPass()+"#"+format.format(t.getDateOfExpire()) + "\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public User[] usersFromFile(String fileName) throws FileNotFoundException, ParseException {
		User[] users = new User[countStr(fileName)];
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		Scanner scan = new Scanner(fr);
		int count = 0;
		while (scan.hasNextLine()) {
			String tempLine = scan.nextLine();
			String[] str = tempLine.split("#");
			SimpleDateFormat format = new SimpleDateFormat();
			format.applyPattern("dd.MM.yyyy");
			Date date= format.parse(str[3]);
			User user = new User(str[0],str[1],str[2], date);
			users[count] = user;
			count++;
		}
		scan.close();

		return users;
	}

	private int countStr(String fileName) {
		File file = new File(fileName);
		FileReader fr;
		int count = 0;
		try {
			fr = new FileReader(file);
			Scanner scan = new Scanner(fr);

			while (scan.hasNextLine()) {
				count++;
				scan.nextLine();
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return count;
	}

	public boolean auth(String login, String pass) {
		User user = new User();
		user.setLogin(login);
		user.setPass(pass);
		if (baseSet.add(user)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		baseSet.forEach(t -> System.out.println(t));
		return "";
	}

}