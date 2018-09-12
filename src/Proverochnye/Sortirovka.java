package Proverochnye;

/**
 * Created by admin on 12.11.2016.
 */
public class Sortirovka
{
    public static void main(String[] args)
    {
        int [] arr = {12,23,10,55,62,48,79};
        for(int i = 0; i<arr.length; i++){
            int min_i = i;
            for(int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[i]){
                    min_i = j;
                }
            }
            swap(arr, i, min_i);
        }
        for (int k = 0; k < arr.length; k++){
            System.out.println( arr[k]);
        }
    }

    private static void swap(int [] values, int i, int j){
        int val = values[i];
        values[i] = values[j];
        values[j] = val;
    }
}
