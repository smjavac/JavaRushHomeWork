package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // а можно и так: int money = Integer.parseInt(br.readLine());
                String many = br.readLine();
        int sMany = Integer.parseInt(many);
        System.out.println("Я буду зарабатывать $"+sMany+" в час».");//напишите тут ваш код//напишите тут ваш код
    }
}