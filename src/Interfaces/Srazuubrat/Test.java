package Interfaces.Srazuubrat;

/**
 * Created by admin on 23.10.2016.
 */
public class Test
{
    public static void main(String[] args)
    {
        Animal animal = new Animal(33);
       Person person = new Person("Bob");
      // Info info1 = new Animal(32);
      //  Info info2 = new Person("Sem");
       // animal.ShowInfo();
      //  person.ShowInfo();
       // info1.ShowInfo();
       // info2.ShowInfo();
       // utputShowInfo(info1);
      //  utputShowInfo(info2);
        utputShowInfo(animal);
        utputShowInfo(person);

    }

    public static void utputShowInfo(Info info){
        info.ShowInfo();
    }


}
