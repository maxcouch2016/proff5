package action12.App;

import java.util.Scanner;

import dao.StudentDaoImpl;
import domain.Sex;
import domain.Student;
import util.HibernateUtil2;

public class StudentApp {

	private static Scanner scan;

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println(">>>>>>>>>> Добавить студента - 1" + "\n>>>>>>>>>> Посмотреть список студентов - 2"
				+ "\n>>>>>>>>>> Удалить студента - 3" + "\n>>>>>>>>>> Закрыть программу - 4");
		scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num == 1) {
			addStudent();
		}
		if (num == 2) {
			listStudent();
		}
		if (num == 3) {
			deleteStudent();
		}
		if (num == 4) {
			closeProg();
		}
	}

	private static void closeProg() {
		HibernateUtil2.getSessionFactory().close();
		System.out.println("Программа закрыта!");
	}

	private static void deleteStudent() {
		System.out.println("Введите ID");
		scan = new Scanner(System.in);
		int id = scan.nextInt();

		StudentDaoImpl studentDaoImpl = new StudentDaoImpl(HibernateUtil2.getSessionFactory());
		studentDaoImpl.delete(id);
		menu();

	}

	private static void listStudent() {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl(HibernateUtil2.getSessionFactory());
		for (Student student : studentDaoImpl.list()) {
			System.out.println("--- " + student);
		}
		menu();

	}

	private static void addStudent() {
		String firstName;
		String lastName;
		String email;
		int sex;

		System.out.println("Введите имя");
		scan = new Scanner(System.in);
		firstName = scan.nextLine();
		System.out.println("Введите фамилию");
		scan = new Scanner(System.in);
		lastName = scan.nextLine();
		System.out.println("Введите почту");
		scan = new Scanner(System.in);
		email = scan.nextLine();
		System.out.println("Введите пол (0, 1, 2)");
		scan = new Scanner(System.in);
		sex = scan.nextInt();

		Sex sEx = Sex.valueOf(sex);

		StudentDaoImpl studentDaoImpl = new StudentDaoImpl(HibernateUtil2.getSessionFactory());
		Student student = new Student(firstName, lastName, email, sEx);
		studentDaoImpl.create(student);
		menu();
	}

}