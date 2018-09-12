package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        //int a =scanner.nextInt();
        //int b =scanner.nextInt();
        //int c =scanner.nextInt();
        //boolean d= a>0&b>0&c>0;
        //boolean i= a>0;
        //boolean e=b>0;
        //boolean f=c>0;
        boolean i=scanner.nextInt()>0;      // а так еще проще и компактней, чем вариант выше!!!!!!!
        boolean e=scanner.nextInt()>0;
        boolean f=scanner.nextInt()>0;

        if(i){
        if(e&f)
            System.out.println(3);
            else if(!(e)&f)
            System.out.println(2);
            else if (!(e)&!(f))
            System.out.println(1);
            //else
            //System.out.println(0);//напишите тут ваш код ---это было лишним
        }
        else if(e){
            if (f)
                System.out.println(2);
            else if(!f)
                System.out.println(1);
            //else if(!(i)&!(f))                           --- и это лишнее
                //System.out.println(1);
            //else
                //System.out.println(0);
        }
         else if(f){
            //if(i&e)                                     --- и это тоже
               // System.out.println(3);
           // else if(!(i)&e)
                //System.out.println(2);
            //else if(!(i)&!(e))
                System.out.println(1);
           // else
                //System.out.println(0);
        }
         else
            System.out.println(0);
    }
}
