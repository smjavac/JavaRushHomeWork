/**
 * Created by admin on 17.04.2016.
 */
public class ToStringlesson24
{
    public static void main(String[] args)
    {
       Lesson h1=new Lesson("Zaur",33);
        System.out.println(h1.toString());
    }
}
class Lesson{
    String name;
    int age;

    public Lesson(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return (name+","+age);
    }
}