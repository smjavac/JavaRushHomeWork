package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        int next = 0;
        for (int i = 0; i < array.length; i++){
             array[i] = scanner.nextInt();
        }

        for (int j = 0; j < array.length; j++){
            for (int k = j; k < array.length; k++)
            {
                if (array[k] < array[j]){
                    next = array[k];
                    array[k] = array[j];
                    array[j] = next;
                }
            }
        }

        for (int l = 0; l < array.length; l++){
            System.out.println(array[l]);
        }
    }
}
