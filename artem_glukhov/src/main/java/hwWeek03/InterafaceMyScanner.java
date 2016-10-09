/*. Написать свой класс MyScanner, который бы работал также как и стандартный
класс Scanner. 
Реализовать методы: next, nextInt, nextDouble, nextLine
hasNext, hasNextLine, hasNextInt, hasNextDouble.
Учесть нюансы:
 - при вводе какого-то значения пользователем в консоли это записывается в "память" сканнера и потом обрабатывается метода
 - если в программе MyScanner с консоли ввести "привет", то оба метода scan.hasNextInt() 
  вернут false и поэтому на экран выведется "Line=привет", 
 - если ввести "10", "20" и "30", то оно должно отрабатывать также как и "10 20 30".
*/
package hwWeek03;

public interface  InterafaceMyScanner {
	
	void next();
	int nextInt();
	double nextDouble();
	boolean hasNext();
	String nextLine ();
	boolean hasNextInt();
	boolean hasNextDouble();
	

}
