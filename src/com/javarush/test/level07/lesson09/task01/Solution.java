package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
           List<Integer> list = new ArrayList<Integer>() ;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            list.add(scanner.nextInt());//напишите тут ваш код
        }

        List<Integer>  list3 = new ArrayList<Integer>();
        List<Integer>list2 = new ArrayList<Integer>();
        List<Integer>list1 = new ArrayList<Integer>();

        for (Integer num: list){

           if (num % 3 == 0& num % 2 == 0){
                list3.add(num);
                list2.add(num);
            }
           else if (num % 3 == 0) list3.add(num);
           else if (num % 2 == 0) list2.add(num);
            else list1.add(num);
        }

        printList(list3);
        System.out.println();
        printList(list2);
        System.out.println();
       printList(list1);

        }

    public static void printList(List<Integer> listxx)
    {
       for (Integer x: listxx)
        System.out.print(x + " "); //напишите тут ваш код
    }
}
