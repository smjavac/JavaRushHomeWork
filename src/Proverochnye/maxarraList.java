package Proverochnye;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 08.01.2017.
 */
public class maxarraList
{
    public static void main(String[] args)
    {
        ArrayList<String> sp = maxString();
        int max = max(sp);
        System.out.println(max);
    }

    public static ArrayList<String> maxString(){
        ArrayList<String> sp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            sp.add(i, sc.nextLine());
        }
        return sp;
    }

    public static int max(ArrayList<String> sp)
    {
        int max = sp.get(0).length();
        for (int i = 1; i < sp.size(); i++)
        {
            if (sp.get(i).length() > max)
                max = sp.get(i).length();//Найдите максимальное значение в этом методе
        }
        return max;
    }
}
