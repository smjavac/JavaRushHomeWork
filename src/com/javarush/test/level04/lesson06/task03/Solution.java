package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
       if (a>b&b>c)
           System.out.println(a+" "+b+" "+c);
       else if (a>c&c>b)
           System.out.println(a+" "+c+" "+b);
       else if(b>a&a>c)
           System.out.println(b+" "+a+" "+c);//напишите тут ваш код
       else if (b>c&c>a)
           System.out.println(b+" "+c+" "+a);
       else if (c>b&b>a)
           System.out.println(c+" "+b+" "+a);
       else if (c>a&a>b)
           System.out.println(c+" "+a+" "+b);


    }
}
