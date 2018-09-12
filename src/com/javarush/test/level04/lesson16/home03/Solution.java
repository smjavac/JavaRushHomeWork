package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {

        int a=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(;true;){

            String s=br.readLine();
            int d=Integer.parseInt(s);
            a+=d;
           if(s.equals("-1")){
               System.out.println(a);
               break;}

        }

    }
}
