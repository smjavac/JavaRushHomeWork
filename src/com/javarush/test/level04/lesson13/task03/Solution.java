package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //int a=1; а это не нужно, при условии, что во втором цикле мы используем для
        for(int x=1;x<11;x++){                // сравнения, переменную из первого цикла

        for(int b=0;b<x;b++){
            System.out.print("8");
        }
           // a++;  это не нужно соотвественно, см. выше
            System.out.println();
        }

    }
}
