package Proverochnye;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class potoky2 {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long startTime = System.currentTimeMillis();
        ArrayList listData = new ArrayList();
        while (inputStream.available() > 0) listData.add(inputStream.read());
        inputStream.close();
        ArrayList result = new ArrayList(new HashSet(listData));
        Collections.sort(result);
        while (!result.isEmpty()) {
            System.out.print(result.get(result.size()-1) + " ");
            result.remove(result.get(result.size()-1));
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("\nвремя работы=" + (finishTime-startTime) + "ms.");
    }
}

 class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        byte[] arrBytes = new byte[256];
        long startTime = System.currentTimeMillis();
        SortedSet list = new TreeSet();
        while(inputStream.available()>0) list.add(inputStream.read());
        inputStream.close();
        while (!list.isEmpty()) {
            System.out.print(list.last() + " ");
            list.remove(list.last());
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("\nвремя работы=" + (finishTime-startTime) + "ms.");
    }
}

 class Solution2
 {
     public static void main(String[] args) throws Exception
     {
         FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

         long[] arrBytes = new long[256];
         long startTime = System.currentTimeMillis();
         while (inputStream.available() > 0)
             arrBytes[inputStream.read()]++;
         inputStream.close(); // Выводим отсортированный по байт-коду в обратном порядке
     }                                                      // for (long i = 255; i >= 0 ; i--) if (arrBytes[(int) i] > 0)
 }                                                     // System.out.print(i + " ");
                                                        // long finishTime = System.currentTimeMillis();
                                                        // System.out.println("\nвремя работы=" + (finishTime-startTime) + "ms."); } }
 class Solution3 {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long[] arrBytes = new long[256];
        long startTime = System.currentTimeMillis();
        int bufferSize = 64000;
        byte buffer[] = new byte[64000];
        while (inputStream.available() > 0) {
            if (inputStream.available() < 64000) bufferSize = inputStream.available();
            inputStream.read(buffer, 0, bufferSize );
            for (int i = 0; i != 0 ; i--)
                if (arrBytes[(int) i] > 0) System.out.print(i + " ");
            long finishTime = System.currentTimeMillis();
            System.out.println("\nвремя работы=" + (finishTime-startTime) + "ms."); } }
                                                        }
