package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();
        //Scanner scanner = new Scanner(System.in);
        //String name2 = scanner.nextLine();
        //System.out.println(name1.length());
        //System.out.println(name2.length());
        if(name2.equals(name1))
            System.out.println("Имена идентичны");
        else if(name1.length()==name2.length())
            System.out.println("Длины имен равны");//напишите тут ваш код

    }
}
