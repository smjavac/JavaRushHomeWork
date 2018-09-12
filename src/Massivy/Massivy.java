package Massivy;

/**
 * Created by admin on 29.04.2016.
 */
public class Massivy
{
    public static void main(String[] args)// опять курил массивы
    {
        int[] a;
        a=new int[5];
         a[0]=15;
        a[1]=30;
         for(int i=0;i<a.length;i++){

             System.out.println(a[i]);
         }

        String[]s=new String[3];
        s[0]="Privet";
        s[1]="Said";
        s[2]="Zaur";
        for(String string:s){
            System.out.println(string);
        }

        //int [] [] dvumer1 = new int[3][5];  // пример вывода двухмерного массива на экран через два цикла for()
        int [] [] dvumer = {{1,5,9,8,3}, {5,6,8,9,7}, {8,7,4,6,1}};
        for (int i = 0; i < dvumer.length; i++){
            for (int k = 0; k < dvumer[i].length; k++){
                System.out.print(dvumer[i] [k] + " ");
            }
            System.out.println();
        }

    }
}
