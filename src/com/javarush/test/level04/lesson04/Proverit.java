package com.javarush.test.level04.lesson04;

/**
 * Created by admin on 11.05.2016.
 */
public class Proverit
{
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(40);
        
    }

    public static void checkInterval(int a){
        if (a>50){
             if (a<100) {
                 System.out.println("Число "+a+" содержится в интервале.");               //а это вместо темы: (кури тему "условные операторы")
             }else {
                 System.out.println("Число "+a+" не содержится в интервале.");
             }
        }else {
            System.out.println("Число "+a+" не содержится в интервале.");
        }


    }



}
