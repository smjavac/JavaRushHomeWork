/**
 * Created by admin on 06.04.2016.
 */
public class Masivyi
{
    public static void main(String []args){
        int[] numbers = new int[5];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=i*10;
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1={1,2,3};
        for(int i=0;i<numbers1.length;i++){
           System.out.println(numbers1[i]);
        }
        String[] st = new String[3];
        st[0]="Привет";
        st[1]="Пока";
        st[2]="Джава";
        System.out.println(st[0]);
        System.out.println(st[2]);
        for(int i=0;i<st.length;i++){
            System.out.println(st[i]);
        }
        System.out.println();
        for(String x:st){
            System.out.println(x);
        }
       int[]st2={1,2,4};
        int sum=1;
        for(int x:st2){
            sum=sum+x;
        }
         System.out.println(sum ); /**если эту команду включить
                                   в скобки цикла for, то она
                                  отработает три раза и выведет
                                  на консоль: 2, 4, 8 **/
        System.out.println(); //двухмерные массивы
        int[][] a={{1,2,3,4,5},{6,7,8},{9,10,11,12}};
        System.out.println(a[1][0]);
        System.out.println();
        int[][]b={{1,2,3},
                  {4,5,6},
                  {7,8,9}};
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }


    }
}
