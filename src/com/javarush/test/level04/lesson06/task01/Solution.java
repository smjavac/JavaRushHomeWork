package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int c = scanner.nextInt();
        if (x<c)
            System.out.println(x);
            else System.out.println(c);//напишите тут ваш код

    }
}