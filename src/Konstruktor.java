/**
 * Created by admin on 15.04.2016.
 */
public class Konstruktor
{
    public static void main(String[] args){
        Hyman human = new Hyman("Zaur",23);
    }
}

   class Hyman{

       public Hyman(){
           System.out.println("Привет из первого конструктора");
       }
       public Hyman(String name){
           System.out.println("привет из второго конструктора");
           this.name=name;
       }
       public Hyman(String name,int age){
           System.out.println("привет из третьего конструктора");

       }
       private String name;
       private int age;
   }
