package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int a = Integer.parseInt(reader.readLine());
        for(int i = 0; i< a; i ++){
            int b = Integer.parseInt(reader.readLine());
             maximum =b>maximum?b:maximum; //так не проходит тестирование хотя выполняет условие, а так проходитф: if (i == 0) {
                                                                                                                     // maximum = num;
                                                                                                                     //  }
                                                                                                                     //  if (num > maximum) {
                                                                                                                     //  maximum = num;
                                                                                                                     //  }
        }
        System.out.println(maximum);
    }
}
