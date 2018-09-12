package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // а можно и так: int money = Integer.parseInt(br.readLine());
        String name = br.readLine();
        String many = br.readLine();
        int sMany = Integer.parseInt(many);
        String age = br.readLine();
        int sAge = Integer.parseInt(age);
        System.out.println(name + " получает " + sMany + " через " + sAge + " лет.");//напишите тут ваш код

    }
}