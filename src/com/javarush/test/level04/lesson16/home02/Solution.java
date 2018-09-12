package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
       Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>b)
        {
            if(b>c)
            System.out.println(b);
            else
                System.out.println(c);
        }
         else if(b>a){
            if(a>c)
             System.out.println(a);
            else
             System.out.println(c);//напишите тут ваш код
         }
    }
}
