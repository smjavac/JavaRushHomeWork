package Interfaces;

/**
 * Created by admin on 25.04.2016.
 */
public class Test
{
    public static void main(String[] args)
    {
        Animal animal1=new Animal(33);// закоментировал вторым
        Person person1=new Person("Said");// закоментировал третьим
       // закоментировал первым animal1.sleep();
       // закоментировал первым person1.sayHello();
        // закоментировал четвертым animal1.showInfo();
        // закоментировал пятым person1.showInfo();

        Info info1=new Animal(33);
        Info info2=new Person("Said");
        // закоментировал шестым info1.showInfo();
        // закоментировал седьмым info2.showInfo();
        getInfo(info1);
        getInfo(person1); /* это тоже самое, если бы там было getInfo(info2) так как
                          переменная info2 ссылается на объект класса Person*/

    }
    public static void getInfo(Info info){
        info.showInfo();
    }
}
