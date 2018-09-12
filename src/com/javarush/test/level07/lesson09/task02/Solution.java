package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0; i < 5; i++){
            list.add(scanner.nextLine());//напишите тут ваш код
        }

        list.remove(2);

        for ( int j = 0; j < list.size(); j++){
            System.out.println(list.get(list.size()-1-j));
        }
    }
}
