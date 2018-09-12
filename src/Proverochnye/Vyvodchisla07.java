package Proverochnye;

/**
 * Created by admin on 28.05.2016.
 */
public class Vyvodchisla07
{
   static int age = 5;

    public static void main(String[] args)
    {
       Vyvodchisla07 v = new Vyvodchisla07();
        v.setAge();


    }

    public void setAge(){
        age++;
        System.out.println(age);
    }
}

class ProStatic{
    //public static int age = 5;
}