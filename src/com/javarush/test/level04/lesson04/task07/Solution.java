package com.javarush.test.level04.lesson04.task07;

/* Количество дней в году
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — невисокосные.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String year = br.readLine();
        int yers = Integer.parseInt(br.readLine());//напишите тут ваш код
        if(yers%4==0&yers%100!=0|yers%400==0){
            int x =366;
            System.out.println("количество дней в году: "+x);}
        else {
            int x = 365;
            System.out.println("количество дней в году: "+x);}
        /*if(yers%100==0&yers%400==0){
            int x =366;
            System.out.println("количество дней в году: "+x);
        } else if(yers%100==0&yers%400!=0|yers%4!=0){
            int x = 365;
            System.out.println("количество дней в году: "+x);
        } else if(yers%4==0){
           int x =366;
            System.out.println("количество дней в году: "+x);
        }// а можно было оставить и это условие else if(yers%4!=0){
           // int x =365;
          //  System.out.println("количество дней в году: "+x);
        //} вместо  этого else if(yers%100==0&yers%400!=0|yers%4!=0)
    */}
}