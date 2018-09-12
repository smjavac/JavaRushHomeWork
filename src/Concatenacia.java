/**
 * Created by admin on 18.04.2016.
 */
public class Concatenacia
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        int a = 5;

        String text = cat + (a + "Cat is ") + cat + a; /* -так можно,а вот так нельзя cat + a + "Cat is " + cat + a;
                                                       Автоматическое приведение к строке только если складываешь со строкой
                                                       cat и a не строки, их нельзя складывать. Складывать в джаве можно только
                                                       числа с числами, либо строки с чем угодно*/

        System.out.println(text);
    }
}
class Cat{

}