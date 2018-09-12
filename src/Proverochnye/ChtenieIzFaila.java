package Proverochnye;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by admin on 16.04.2017.
 */
public class ChtenieIzFaila
{
    public static void main(String[] args) throws FileNotFoundException
    {

       //String separator = File.separator;
      // String str = "D:\\test.txt";
       File file = new File("d:\\test.txt");

        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
         System.out.println(sc.nextLine());
       }
        sc.close();
    }
}
