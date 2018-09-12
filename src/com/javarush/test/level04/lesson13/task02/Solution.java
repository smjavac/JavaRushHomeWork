package com.javarush.test.level04.lesson13.task02;

import java.io.*;
import java.util.Scanner;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       Scanner scanner=new Scanner(System.in);
        int m =scanner.nextInt();
        int n =scanner.nextInt();
        for(int a=m;a>0;a--){
            //int b=n - это получается не нужно, так как два раза объявлять переменную б невозможно
            for(int b=n;b>0;b--){           // потому-что эта запись эквивалентна вот такой:
                System.out.print("8");      //     int b=m;
            }                               //     while (b>0){
            System.out.println();           //     b++;
        }                                   //     System.out.print("8");}
    }
}
