package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num.length; i++){
            num[num.length-1-i] = scanner.nextInt();
        }

        for (int j = 0; j < 10; j++){
            System.out.println(num[j]);//напишите тут ваш код
        }

    }
}
