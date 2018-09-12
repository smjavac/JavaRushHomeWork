package Proverochnye;

/**
 * Created by admin on 12.03.2017.
 */
public class Indexof
{
   public void put(int key, Object value){
       //long index = indexOf(200);

   }

    private static int indexOf(int key)
    {

        return key % 100;
    }

    public static void main(String[] args)
    {
        int index = indexOf(202);
        int f = 4;
        System.out.println(index);
        int c = index = f;
        System.out.println(c);
        System.out.println(index);

    }
}
