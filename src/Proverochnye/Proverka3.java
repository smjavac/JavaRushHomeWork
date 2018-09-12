package Proverochnye;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Proverka3
{
    public static void main(String[] args) throws ClassNotFoundException, Exception
    {
      // Foo foo = new Foo();
       //foo.getClass();
       // System.out.println(Foo.class.getName());
     //  Class.forName("Proverochnye.Foo");
     //   Class clas;

     //   System.out.println();
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = reader.readLine();
        while (true){
            if ( s.equals("soapOpera"));
            else if ( s.equals("soap"));
            else if ( s.equals("Opera"));
           // else break;

        }

    }
}

  //class Foo {
  // static {
  //      System.out.println("класс фу");
 //   }

  //  public static void goTo (){
 //       System.out.println("goTo");
 //   }

//}

 /*abstract class PetCreator {
    //инициализация генератора случайных чисел
    private Random rand = new Random(47);
    //абстрактный метод возвращает список возможных типов(классов) животных
    public abstract List<Class<? extends Pet>> getTypes();


    public Pet randomPet(){ // Создание одного случайного объекта Pet
        // генерация случайного номера в диапазоне списка классов животных
        int n = rand.nextInt(getTypes().size());
        try {//создание нового объекта для класса с данным номером в списке классов
            return getTypes().get(n).newInstance(); }
        catch( InstantiationException e) {throw new RuntimeException(e); }
        catch (IllegalAccessException e) {throw new RuntimeException(e);}
    }


    public Pet[] createArray(int size) {//создание массива случайных Pet
        Pet[] result = new Pet[size];
        for (int i=0; i < size; i++)
            result[i] = randomPet();
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {// создание списка случайных Pet
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}

 class Petcounter extends HashMap<String,Integer> {
     public void count(String type) {
         get(type);
     }
 }*/

