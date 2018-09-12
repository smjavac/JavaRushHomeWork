package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
       ArrayList<String> sp = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
                        sp.add(i, sc.nextLine());
        }

        int a = 0;

        String b = null;
        String c ;

        for (int j = 0; j < sp.size(); j++){

            if (sp.get(j).length() > a){
                a = sp.get(j).length();
                b = sp.get(j);
            }
            else if ((sp.get(j).length() == a)){
                c = sp.get(j);
                System.out.println(c);
            }
        }

        System.out.println(b);

    }

}
