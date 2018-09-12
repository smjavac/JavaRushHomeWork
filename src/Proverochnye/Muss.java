package Proverochnye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 19.06.2016.
 */
public class Muss
{
    public static void main(String[] args) throws IOException
    {
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println("Min is " + min);
    }
}
