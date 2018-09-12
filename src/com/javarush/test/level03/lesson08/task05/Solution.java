package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              String s1=br.readLine();
        String s2=br.readLine();;
        String s3=br.readLine();
        System.out.println(s1+" + "+s2+" + "+s3+" = Чистая любовь, да-да!");//напишите тут ваш код
        // а можно и так:  System.out.println(br.readLine()+" + "+br.readLine()+" + "+br.readLine()+" = Чистая любовь, да-да!");
        // т.е. не нужно будет создавать переменных и передавать их в метод System.out.println,
        // так как он сразу будет выводить то, что считал метод readLine объекта BufferedReader br

    }
}