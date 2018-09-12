package Proverochnye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 23.05.2016.
 */
public class Booleane
{
    public static void main(String[] args) throws IOException
    {
        boolean isExit = false;
        while (!isExit)
        {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String s = buffer.readLine();
            isExit = s.equals("спорт");
            System.out.println(s);
        }
    }
}
//Программа будет вводить строки с клавиатуры, пока не будет введена строка "спорт".