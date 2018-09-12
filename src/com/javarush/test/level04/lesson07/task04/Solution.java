package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        boolean i=scanner.nextInt()>0;
        boolean e=scanner.nextInt()>0;
        boolean f=scanner.nextInt()>0;
        if(i){
            if(e&f){
                System.out.println("количество отрицательных чисел: " +0);
                System.out.println("количество положительных чисел: " +3);
            } else if(!(e)&f){
                System.out.println("количество отрицательных чисел: " +1);
                System.out.println("количество положительных чисел: " +2);
            }else if (!(e)&!(f)){
                System.out.println("количество отрицательных чисел: " +2);
                System.out.println("количество положительных чисел: " +1);}
        }
                //напишите тут ваш код
        else if(e)
        {
            if (f)
            {
                System.out.println("количество отрицательных чисел: " +1);
                System.out.println("количество положительных чисел: " +2);
            } else if (!f)
            {
                System.out.println("количество отрицательных чисел: "+2);
                System.out.println("количество положительных чисел: "+1);
            }
        }
        else if(f){
            System.out.println("количество отрицательных чисел: "+2);
            System.out.println("количество положительных чисел: "+1);
        }
        else{
            System.out.println("количество отрицательных чисел: "+3);
            System.out.println("количество положительных чисел: "+0);}
    }
}
                         /*int pos = 0;
                         int neg = 0;
                        if (a>0) {pos++;} else {neg++;}
                            if (b>0) {pos++;} else {neg++;}
                            if (c>0) {pos++;} else {neg++;}
                            System.out.println("количество отрицательных чисел: " + neg);
                            System.out.println("количество положительных чисел: " + pos);*/
