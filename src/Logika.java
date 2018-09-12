import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by admin on 04.04.2016.
 */
public class Logika
{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int walue;// = scanner.nextInt();
          do{
            System.out.println("Введите цифру 5");
              walue = scanner.nextInt();
        } while (walue!=5);

         System.out.println("Вы ввели цифру "+walue);
    }
}

