package hwWek03.scanner;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Denni on 10/8/2016.
 */
public class MyScanner {

    private InputStreamReader inputStreamReader;
    BufferedReader bufferedReader;
    StringBuffer safe;
    LinkedList<String> list = new LinkedList<>();
    private boolean ifTerminal = false;
   

    public MyScanner(InputStream in) {
        bufferedReader = new BufferedReader(new InputStreamReader(in));
        ifTerminal = true;
//        safe = new StringBuffer(1024);
    }

    public MyScanner(File fileInput) throws FileNotFoundException {
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileInput)));
//        list=createList();
    }


    public String nextLine() {
        safe = new StringBuffer();
        if (list != null)

            try {
//                System.out.println(bufferedReader.ready());
                String str = bufferedReader.readLine();
                if (str != null) {
                    safe.append(str);
                } else {
                    throw new NoSuchElementException("no line found!!!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        return safe.toString();
    }

    public String next() {
        if (list.size() == 0) {
            list = createList();
        }
        if (list.size() != 0) {
            return list.remove(0);
        } else {
            throw new NoSuchElementException("no line found!!!");
        }
    }

    private LinkedList<String> createList() {
        String[] arrFromLine = nextLine().split(" ");
        for (int i = 0; i < arrFromLine.length; i++) {
            list.add(arrFromLine[i]);
        }
        return list;
    }

    public boolean hasNext() {
        if (list.size() > 0) {
            return true;
        }
        try {
            if (list.size() == 0 & !ifTerminal) {
                list = createList();
                return true;
            }
        } catch (NoSuchElementException e) {

            return false;
        }
        return false;
    }

    public boolean hasNextLine() {
        try {
            if (bufferedReader.ready()) {
                return true;
            }
        } catch (IOException e) {
            return false;
        }
        return false;
    }

    public int nextInt() {



        return 0;
    }

}
