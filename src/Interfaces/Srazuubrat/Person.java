package Interfaces.Srazuubrat;

/**
 * Created by admin on 23.10.2016.
 */
public class Person implements Info
{
    String name;

    public Person(String name){
        this.name = name;
    }

    public void ShowInfo(){
        System.out.println("my name is "+ name);
    }
}
