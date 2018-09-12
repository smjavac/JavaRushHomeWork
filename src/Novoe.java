import java.util.Scanner;

/**
 * Created by admin on 04.04.2016.
 */
public class Novoe
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String string = s.nextLine();
        System.out.println("Вы ввели "+string);
    }
}
