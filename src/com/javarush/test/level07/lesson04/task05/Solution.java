package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int[] num = new int[20];
        int[] num2 = new int[10];
        int[] num3 = new int[10];
        Scanner scanner = new Scanner(System.in);

       for (int i = 0; i < num.length; i++) num[i] = scanner.nextInt();

       for (int j = 0; j < num2.length; j++) {
           num2[j] = num[j];
           num3[j] = num[j + 10];
           System.out.println(num3[j]);     // гениально, и не вериться, что это сделал я !!!!)))))
       }

                                                                            //  for (int k = 0; k < num3.length; k++) num3[k] = num[k + 10];

      // for (int l = 0; l < num3.length; l++) System.out.println(num3[l]);

       //напишите тут ваш код

    }
}
