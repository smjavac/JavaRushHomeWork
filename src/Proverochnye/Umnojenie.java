package Proverochnye;

/**
 * Created by admin on 25.05.2016.
 */
public class Umnojenie
{
    public static void main(String[] args)
    {
        int i = 1;
        while(i <= 10)
        {
            int j = 1;
            while(j < 10)
            {
                System.out.print(j * i + " ");
                j++;
            }
            System.out.println(i * j + " ");
            i++;
        }

    }
}
