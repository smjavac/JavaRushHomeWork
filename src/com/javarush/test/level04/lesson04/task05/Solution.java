package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String some = br.readLine();
        int x = Integer.parseInt(some);
        if(x>0){
            System.out.println(x*2);
        }else {

            System.out.println(x+1);
        }//напишите тут ваш код

    }

}