package Interfaces.Srazuubrat;

/**
 * Created by admin on 23.10.2016.
 */
public class Animal implements Info
{
    public void ShowInfo(){
        System.out.println("my id is " + id);
    }

    public int id;

    public Animal(int id){
        this.id = id;
    }
    public void Sleep(){
        System.out.println("I am sleeping");
    }
}
