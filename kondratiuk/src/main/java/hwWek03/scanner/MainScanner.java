package hwWek03.scanner;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Denni on 10/8/2016.
 */
public class MainScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\projects/test_maven/FileDirectory/fileName1.txt"));
//        MyScanner myScanner = new MyScanner(new File("D:\\projects/test_maven/FileDirectory/fileName1.txt"));
        MyScanner myScanner = new MyScanner(System.in);
        System.out.println(myScanner.next());
        System.out.println(myScanner.hasNext());
        System.out.println(myScanner.hasNextLine());

//        System.out.println(myScanner.nextLine());
//        System.out.println(myScanner.nextLine());
//        System.out.println(myScanner.nextLine());

//        System.out.println(myScanner.next());
//        System.out.println(myScanner.next());

        System.out.println("вапрол");
//        System.out.println(scanner.next());
//        System.out.println(scanner.next());
//        System.out.println(scanner.next());

//        System.out.println(myScanner.next());
//        System.out.println(scanner.next());
//        byte[] bufer = new byte[1024];
//        String stoks = "";
//        DataInputStream reader = new DataInputStream(System.in);
//        try {
//
//            reader.read(bufer);
////            stoks =reader.readUTF();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        char ch;
//        for (int i = 0; i < bufer.length; i++) {
//            ch = (char) (bufer[i]);
//            System.out.println(ch);
//            if (ch!=' '&&bufer[i]!=0){
//              stoks+=ch;
//            }else{
//                break;
//            }
//
//        }
//
//        System.out.println(Arrays.toString(bufer));
//        String str = new String(bufer);
//        System.out.println(str);
//        System.out.println(stoks);


    }
}
